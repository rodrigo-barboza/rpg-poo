package rpg.poo.model;
import java.util.Random;
import java.util.Scanner;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Assassino extends Personagem implements Combate, Constantes{
    private int laminaNoturna;
    private int laminaNoturnaEnergia = 40;
    private int retaDaMorte;
    private int retaDaMorteEnergia = 70;
    private int energia;
    
    public Assassino(){
        raca = new Raca();
        
        raca.setTipo("Assassino");
        raca.setAtributo("Energia");
        raca.setVida(VIDA_ASSASSINO);
        raca.setResistenciaMagica(RES_MAGIC_ASSASSINO);
        raca.setArmadura(ARMADURA_ASSASSINO);
        raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_ASSASSINO);
        raca.setVelocidadeDeAtaque(VEL_ATQ_ASSASSINO);
        
        this.laminaNoturna = LAMINA_NOTURNA;
        this.retaDaMorte = RETA_DA_MORTE;
        this.energia = ENERGIA;
    } 
    
    @Override
    public int usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        Random rand = new Random();
        if (danoHabilidadeEspecial == laminaNoturna){
            vidaInimigo -= laminaNoturna - rand.nextInt(inimigo.getArmaduraIn());
        }
        
        if (danoHabilidadeEspecial == retaDaMorte){
            vidaInimigo -= retaDaMorte - rand.nextInt(inimigo.getArmaduraIn());
        }
        
        return vidaInimigo;
    }
    
    @Override
    public int usarAtaqueBasico (int vidaInimigo){
        Random rand = new Random();
        vidaInimigo -= raca.getDanoDeHabilidade() - rand.nextInt(inimigo.getArmaduraIn());
        
        return vidaInimigo;
    }
    
    @Override
    public void subiuNivel(){
        laminaNoturna  = LAMINA_NOTURNA + (nivel*CONST_LAMINA_NOTURNA);
        retaDaMorte    = RETA_DA_MORTE  + (nivel*CONST_RETA_DA_MORTE);
        laminaNoturna += nivel*CONST_LAMINA_NOTURNA_ENERGIA;
        retaDaMorte   += nivel*CONST_RETA_DA_MORTE_ENERGIA;
    }

    @Override
    public void iniciarMissao(String missaoEscolhida) {
        // configurar ambiente para luta
        // capturar os dados do inimigo que vou enfrentar
        int vidaInimigo = inimigo.getVidaIn();
        // meus dados atuais
        int vida = raca.getVida();
        int energiaAtual = energia;
        int vidaInimigoOld;
        
        // iniciar luta
        int turno; // 1 para player, 2 para inimigo
        boolean acaoDefesa = false;
        // sortear quem vai iniciar
        Random rand = new Random();
        turno = rand.nextInt(2)+1;
        
        while (vida >= 0 || vidaInimigo >= 0){
            if (vidaInimigo <= 0 || vida <= 0) break;
            else{
                if (turno == 1) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println(super.nome+": "+vida+" vs "+inimigo.getNomeIn()+": "+vidaInimigo);
                    System.out.println("Atributos do inimigo: Resistência Mágica ["+inimigo.getResistenciaMagicaIn()+"] / Armadura: ["+inimigo.getArmaduraIn()+"]/ Dano: ["+inimigo.getDanoDeHabilidade()+"]");
                    System.out.println("--------------------------------------------------------------------------------------------");
                
                    escolherAcao();
                                
                    Scanner input = new Scanner(System.in);
                    int escolha = input.nextInt();
                
                    vidaInimigoOld = vidaInimigo;
                
                    switch(escolha){
                        //int danoHabilidadeEspecial, int vidaInimigo
                        case 1: vidaInimigo = usarAtaqueBasico(vidaInimigo); 
                                ThreadCombate iteratorA = new ThreadCombate("Ataque básico", inimigo.getNomeIn(), super.nome, (rand.nextInt(750)+780), (vidaInimigoOld-vidaInimigo), turno);
                                break;
                        case 2: vidaInimigo = usarHabilidadeEspecial(laminaNoturna, vidaInimigo); 
                                energiaAtual -= laminaNoturnaEnergia;
                                ThreadCombate iteratorB = new ThreadCombate("Lâmina Noturna", inimigo.getNomeIn(), super.nome, (rand.nextInt(850)+700), (vidaInimigoOld-vidaInimigo), turno);
                                break;
                        case 3: vidaInimigo = usarHabilidadeEspecial(retaDaMorte, vidaInimigo); 
                                energiaAtual -= retaDaMorteEnergia;
                                ThreadCombate iteratorC = new ThreadCombate("Reta da Morte", inimigo.getNomeIn(), super.nome, (rand.nextInt(950)+800), (vidaInimigoOld-vidaInimigo), turno);
                                break;
                        case 4: acaoDefesa = true;
                        default: System.out.println("Perdeu a vez!");
                    }
                
                    turno = 2;
                } else {
                    if (!acaoDefesa){
                        vida = ataqueInimigo(vida);
                    } else {
                        defenderAtaqueInimigo();
                        ThreadCombate iteratorD = new ThreadCombate("void", inimigo.getNomeIn(), super.nome, (rand.nextInt(500)+100), 0, 3);
                    }
                    turno = 1;
                }
            }
        }
        
        if (vida > vidaInimigo){
            Thread iteratorN = new ThreadCombate("", "", "", 3000, 0, 3);
            iteratorN.run();
            System.out.println("\n\tVitória!");
            int nivelAnterior = nivel;
            super.missaoCompleta();
            if (nivelAnterior != nivel) this.subiuNivel();            
        } else {
            System.out.println("\n\tVocê foi derrotado!");
        }
    }
    
    @Override
    public void escolherAcao(){
        System.out.println("1 - Desferir ataque básico [causa "+raca.getDanoDeHabilidade()+" de dano]");
        System.out.println("2 - Usar Lamina Noturna [causa "+laminaNoturna+"de dano][requer "+laminaNoturnaEnergia+" de energia]");
        System.out.println("3 - Usar Reta da Morte [causa "+retaDaMorte+"de dano][requer "+retaDaMorteEnergia+" de energia]");
        System.out.println("4 - Defender ataque inimigo");
    }
    
    @Override
    public int ataqueInimigo(int vida) {
        Random rand = new Random();
        if (inimigo.getTipoIn() == "fisico")
            vida -= inimigo.getDanoDeHabilidade() - rand.nextInt(raca.getArmadura());
        else
            vida -= inimigo.getDanoDeHabilidade() - rand.nextInt(raca.getResistenciaMagica());
        return vida;
    }

    @Override
    public void defenderAtaqueInimigo() {
        System.out.println("Você defendeu do ataque inimigo!");
    }
}
