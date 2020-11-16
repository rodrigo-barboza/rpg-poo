package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Mago extends Raca implements Combate, Constantes{
    private int impetoGlorioso;
    private int outraDimensao;
    private int mana;
    
    public Mago(){
        super.setArmadura(10);
        super.setAtributo("Mana");
        super.setDanoDeHabilidade(40);
        super.setPoderDeHabilidade(100);
        super.setResistenciaMagica(20);
        super.setTenacidade(0);
        super.setVelocidadeDeAtaque(5);
        super.setVida(175);
        impetoGlorioso = 60;
        outraDimensao = 80;
        mana = 100;
    }
    
    @Override
    public void usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        
    }
    
    @Override
    public void usarAtaqueBasico (int vidaInimigo){
        
    }
}
