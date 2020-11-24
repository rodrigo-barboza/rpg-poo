package rpg.poo.model;
import rpg.poo.controller.Acoes;

public abstract class Personagem implements Acoes{
    protected String nome;
    protected int nivel = 1;
    protected int missoesConcluidas;
    public Raca raca;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
    
    @Override
    public void menu(){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Missões");
        System.out.println("2 - Meus atributos\n");
    }
}
