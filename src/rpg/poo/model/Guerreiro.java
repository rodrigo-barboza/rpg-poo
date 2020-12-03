package rpg.poo.model;
import java.util.Random;
import java.util.Scanner;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Guerreiro extends Personagem implements Constantes, Combate{
    private int escudoDePedra;
    private int escudoDePedraFuria = 50;
    private int investidaMilagrosa;
    private int investidaMilagrosaFuria = 70;
    private int furia;
    
    public Guerreiro (){
        raca = new Raca();
        
        raca.setTipo("Guerreiro");
        raca.setArmadura(ARMADURA_GUERREIRO);
        raca.setAtributo("Resistência");
        raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_GUERREIRO);
        raca.setResistenciaMagica(RES_MAGIC_GUERREIRO);
        raca.setVelocidadeDeAtaque(VEL_ATQ_GUERREIRO);
        raca.setVida(VIDA_GUERREIRO);
        
        escudoDePedra = ESCUDO_DE_PEDRA;
        investidaMilagrosa = INVESTIDA_MILAGROSA;
        furia = FURIA;
    }
    
    @Override
    public int usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        Random rand = new Random();
        if (danoHabilidadeEspecial == escudoDePedra){
            vidaInimigo -= escudoDePedra - rand.nextInt(inimigo.getArmaduraIn());
        }
        
        if (danoHabilidadeEspecial == investidaMilagrosa){
            vidaInimigo -= investidaMilagrosa - rand.nextInt(inimigo.getArmaduraIn());
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
        escudoDePedra       = ESCUDO_DE_PEDRA + (nivel*CONST_ESCUDO_DE_PEDRA);
        investidaMilagrosa  = INVESTIDA_MILAGROSA + (nivel*CONST_INVESTIDA_MILAGROSA);
        escudoDePedra      += nivel*CONST_ESCUDO_DE_PEDRA_FURIA;
        investidaMilagrosa += nivel*CONST_INVESTIDA_MILAGROSA_FURIA;
    }

    @Override
    public void iniciarMissao(String missaoEscolhida) {
        System.out.println("Em iniciar missão. ");
        // configurar ambiente para luta
        // capturar os dados do inimigo que vou enfrentar
        int vidaInimigo = inimigo.getVidaIn();
        // meus dados atuais
        int vida = raca.getVida();
        int energiaAtual = furia;
        int vidaInimigoOld;
        
        // iniciar luta
        int turno; // 1 para player, 2 para inimigo
        boolean acaoDefesa = false;
        // sortear quem vai iniciar
        Random rand = new Random();
        turno = rand.nextInt(2)+1;
        
        while (vida >= 0 || vidaInimigo >= 0){
            if (vidaInimigo <= 0 || vida <= 0) break;
            else {
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
                        case 2: vidaInimigo = usarHabilidadeEspecial(escudoDePedra, vidaInimigo); 
                                energiaAtual -= escudoDePedraFuria;
                                ThreadCombate iteratorB = new ThreadCombate("Escudo de Pedra", inimigo.getNomeIn(), super.nome, (rand.nextInt(850)+700), (vidaInimigoOld-vidaInimigo), turno);
                                break;
                        case 3: vidaInimigo = usarHabilidadeEspecial(investidaMilagrosa, vidaInimigo); 
                                energiaAtual -= investidaMilagrosaFuria;
                                ThreadCombate iteratorC = new ThreadCombate("Investida Milagrosa", inimigo.getNomeIn(), super.nome, (rand.nextInt(950)+800), (vidaInimigoOld-vidaInimigo), turno);
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
            //String ataque, String nomeInimigo, String nome, int tempo, int danoCausado, int turno)
            ThreadCombate iteratorN = new ThreadCombate("", "", "", 3000, 0, 3);
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
        System.out.println("2 - Usar Escudo de Pedra [causa "+escudoDePedra+"de dano][requer "+escudoDePedraFuria+" de fúria]");
        System.out.println("3 - Usar Investida Milagrosa [causa "+investidaMilagrosa+"de dano][requer "+investidaMilagrosaFuria+" de fúria]");
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
