package rpg.poo.model;
/*


*/
public abstract class Personagem {
    protected String nome;
    protected int nivel = 1;
    protected int missoesConcluidas;
    protected Raca raca;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
}
