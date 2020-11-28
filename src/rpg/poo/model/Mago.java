package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Mago extends Personagem implements Combate, Constantes{
    private int impetoGlorioso;
    private int outraDimensao;
    private int mana;
    
    public Mago(){
        raca = new Raca();
        
        raca.setTipo("Mago");
        raca.setArmadura(ARMADURA_MAGO);
        raca.setAtributo("Mana");
        raca.setDanoDeHabilidade(40);
        raca.setPoderDeHabilidade(100);
        raca.setResistenciaMagica(RES_MAGIC_MAGO);
        raca.setTenacidade(0);
        raca.setVelocidadeDeAtaque(VEL_ATQ_MAGO);
        raca.setVida(VIDA_MAGO);
        
        impetoGlorioso = IMPETO_GLORIOSO;
        outraDimensao = OUTRA_DIMENSAO;
        mana = MANA;
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
