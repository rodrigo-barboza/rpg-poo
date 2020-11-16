package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Assassino extends Raca implements Combate, Constantes{
    private int laminaNoturna;
    private int retaDaMorte;
    private int energia;
    
    public Assasino()
    {
        super.getAtributo("Energia");
        super.getVida(200);
        super.getResistenciaMagica(15);
        super.getArmadura(20);
        super.getTenacidade(10);
        super.getDanoDeHabilidade(40);
        super.getPoderDeHabilidade(10);
        super.getVelocidadeDeAtaque(20);
        this.laminaNoturna = 45;
        this.retaDaMorte = 35;
        this.energia = 120;
    } 
}
