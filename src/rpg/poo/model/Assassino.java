package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Assassino extends Raca implements Combate, Constantes{
    private int laminaNoturna;
    private int retaDaMorte;
    private int energia;
    
    public Assassino()
    {
        super.setAtributo("Energia");
        super.setVida(200);
        super.setResistenciaMagica(15);
        super.setArmadura(20);
        super.setTenacidade(10);
        super.setDanoDeHabilidade(40);
        super.setPoderDeHabilidade(10);
        super.setVelocidadeDeAtaque(20);
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
