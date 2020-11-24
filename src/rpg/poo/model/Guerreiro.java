package rpg.poo.model;
import rpg.poo.controller.Combate;
import rpg.poo.controller.Constantes;

public class Guerreiro extends Personagem implements Constantes, Combate{
    private int escudoDePedra;
    private int investidaMilagrosa;
    private int furia;
    
    public Guerreiro (){
        raca = new Raca();
        
        raca.setArmadura(12);
        raca.setAtributo("Resistência");
        raca.setDanoDeHabilidade(35);
        raca.setPoderDeHabilidade(0);
        raca.setResistenciaMagica(30);
        raca.setTenacidade(45);
        raca.setVelocidadeDeAtaque(10);
        raca.setVida(300);
        
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
