package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Guerreiro extends Personagem implements Constantes, Combate{
    private int escudoDePedra;
    private int investidaMilagrosa;
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
    public void usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        
    }
    
    @Override
    public void usarAtaqueBasico (int vidaInimigo){
        
    }
    
    @Override
    public void lutar(int nivel, int missaoEscolhida){
        
    }
}
