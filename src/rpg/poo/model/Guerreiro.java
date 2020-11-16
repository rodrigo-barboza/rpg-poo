package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Guerreiro extends Raca implements Constantes, Combate{
    private int escudoDePedra;
    private int investidaMilagrosa;
    private int furia;
    
    public Guerreiro (){
        super.setArmadura(12);
        super.setAtributo("Resistência");
        super.setDanoDeHabilidade(35);
        super.setPoderDeHabilidade(0);
        super.setResistenciaMagica(30);
        super.setTenacidade(45);
        super.setVelocidadeDeAtaque(10);
        super.setVida(300);
        escudoDePedra = 20;
        investidaMilagrosa = 30;
        furia = 40;
    }
    
    @Override
    public void usarHabilidadeEspecial (int danoHabilidadeEspecial, int vidaInimigo){
        
    }
    
    @Override
    public void usarAtaqueBasico (int vidaInimigo){
        
    }
}
