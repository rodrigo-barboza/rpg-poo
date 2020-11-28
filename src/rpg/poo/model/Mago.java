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
        raca.setArmadura(10);
        raca.setAtributo("Mana");
        raca.setDanoDeHabilidade(40);
        raca.setPoderDeHabilidade(100);
        raca.setResistenciaMagica(20);
        raca.setTenacidade(0);
        raca.setVelocidadeDeAtaque(5);
        raca.setVida(175);
        
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
    
    @Override
    public void lutar(int nivel, int missaoEscolhida){
        
    }
    
    @Override
    public void subiuNivel(){
        
    }
}
