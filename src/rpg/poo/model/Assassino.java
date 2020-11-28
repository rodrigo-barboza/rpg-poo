package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Assassino extends Personagem implements Combate, Constantes{
    private int laminaNoturna;
    private int retaDaMorte;
    private int energia;
    
    public Assassino(){
        raca = new Raca();
        
        raca.setTipo("Assassino");
        raca.setAtributo("Energia");
        raca.setVida(VIDA_ASSASSINO);
        raca.setResistenciaMagica(RES_MAGIC_ASSASSINO);
        raca.setArmadura(ARMADURA_ASSASSINO);
        raca.setTenacidade(10);
        raca.setDanoDeHabilidade(40);
        raca.setPoderDeHabilidade(10);
        raca.setVelocidadeDeAtaque(VEL_ATQ_ASSASSINO);
        
        this.laminaNoturna = LAMINA_NOTURNA;
        this.retaDaMorte = RETA_DA_MORTE;
        this.energia = ENERGIA;
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
