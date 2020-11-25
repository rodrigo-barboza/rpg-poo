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
        raca.setVida(200);
        raca.setResistenciaMagica(15);
        raca.setArmadura(20);
        raca.setTenacidade(10);
        raca.setDanoDeHabilidade(40);
        raca.setPoderDeHabilidade(10);
        raca.setVelocidadeDeAtaque(20);
        
        this.laminaNoturna = 45;
        this.retaDaMorte = 35;
        this.energia = 120;
    } 
    
    @Override
    public void usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        
    }
    
    @Override
    public void usarAtaqueBasico (int vidaInimigo){
        
    }
}
