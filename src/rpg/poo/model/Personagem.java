package rpg.poo.model;
import rpg.poo.controller.Acoes;

public abstract class Personagem implements Acoes{
    protected String nome;
    protected int nivel = 1;
    protected int missoesConcluidas = 0;
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
        System.out.println("1 - Missões"); // chama o método missoesDoNivel()
        System.out.println("2 - Meus atributos\n"); // chama o método exibeAtributos();
    }
    
    @Override
    public void missoesDoNivel(int nivel){
        // serão listadas as missões para o nível do jogador
    }
    
    @Override
    public void exibeAtributos(){
        // lista todos atributos atuais do jogador
    }
    
    @Override
    public void missaoCompleta(){
        // incrementa o número de missões concluidas para o jogador e verifica se o mesmo subiu de nível
    }
    
    @Override
    public void subiuNivel(){
        // incrementa o nível do jogador e atualiza os atributos do mesmo
    }
}
