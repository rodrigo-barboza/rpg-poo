package rpg.poo.model;
import java.util.Random;
import java.util.Scanner;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Mago extends Personagem implements Combate, Constantes{
    private int impetoGlorioso;
    private int impetoGloriosoMana = 60;
    private int outraDimensao;
    private int outraDimensaoMana = 90;
    private int mana;
    
    public Mago(){
        raca = new Raca();
        
        raca.setTipo("Mago");
        raca.setArmadura(ARMADURA_MAGO);
        raca.setAtributo("Mana");
        raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_MAGO);
        raca.setResistenciaMagica(RES_MAGIC_MAGO);
        raca.setVelocidadeDeAtaque(VEL_ATQ_MAGO);
        raca.setVida(VIDA_MAGO);
        
        impetoGlorioso = IMPETO_GLORIOSO;
        outraDimensao = OUTRA_DIMENSAO;
        mana = MANA;
    }
    
    @Override
    public int usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        Random rand = new Random();
        if (danoHabilidadeEspecial == impetoGlorioso){
            vidaInimigo -= impetoGlorioso - rand.nextInt(inimigo.getResistenciaMagicaIn());
        }
        
        if (danoHabilidadeEspecial == outraDimensao){
            vidaInimigo -= outraDimensao - rand.nextInt(inimigo.getResistenciaMagicaIn());
        }
        
        return vidaInimigo;
    }
    
    @Override
    public int usarAtaqueBasico (int vidaInimigo){
        Random rand = new Random();
        vidaInimigo -= raca.getDanoDeHabilidade() - rand.nextInt(inimigo.getResistenciaMagicaIn());
        
        return vidaInimigo;
    }
    
    @Override
    public void subiuNivel(){
        impetoGlorioso      = IMPETO_GLORIOSO    + (nivel*CONST_IMPETO_GLORIOSO);
        outraDimensao       = OUTRA_DIMENSAO     + (nivel*CONST_OUTRA_DIMENSAO);
        impetoGloriosoMana += nivel*CONST_IMPETO_GLORIOSO_MANA;
        outraDimensaoMana  += nivel*CONST_OUTRA_DIMENSAO_MANA;        
    }

    @Override
    public void iniciarMissao(String missaoEscolhida) {
        // configurar ambiente para luta
        // capturar os dados do inimigo que vou enfrentar
        int vidaInimigo = inimigo.getVidaIn();
        // meus dados atuais
        int vida = raca.getVida();
        int energiaAtual = mana;
        int vidaInimigoOld;
        
        // iniciar luta
        int turno; // 1 para player, 2 para inimigo
        boolean acaoDefesa = false;
        // sortear quem vai iniciar
        Random rand = new Random();
        turno = rand.nextInt(2)+1;
        
        while (vida < 0 || vidaInimigo < 0){
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
                    case 1: 
                            vidaInimigo = usarAtaqueBasico(vidaInimigo);
                            ThreadCombate iteratorA = new ThreadCombate("Ataque básico", inimigo.getNomeIn(), super.nome, (rand.nextInt(750)+780), (vidaInimigoOld-vidaInimigo), turno);
                            break;
                    case 2:  
                            vidaInimigo = usarHabilidadeEspecial(impetoGlorioso, vidaInimigo);
                            energiaAtual -= impetoGloriosoMana; 
                            ThreadCombate iteratorB = new ThreadCombate("Impeto Glorioso", inimigo.getNomeIn(), super.nome, (rand.nextInt(850)+700), (vidaInimigoOld-vidaInimigo), turno);
                            break;
                    case 3: 
                            vidaInimigo = usarHabilidadeEspecial(outraDimensao, vidaInimigo); 
                            energiaAtual -= outraDimensaoMana; 
                            ThreadCombate iteratorC = new ThreadCombate("Outra Dimensão", inimigo.getNomeIn(), super.nome, (rand.nextInt(950)+800), (vidaInimigoOld-vidaInimigo), turno);
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
        
        if (vida > vidaInimigo){
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
        System.out.println("2 - Usar Escudo de Pedra [causa "+impetoGlorioso+"de dano][requer "+impetoGloriosoMana+" de fúria]");
        System.out.println("3 - Usar Investida Milagrosa [causa "+outraDimensao+"de dano][requer "+outraDimensaoMana+" de fúria]");
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
