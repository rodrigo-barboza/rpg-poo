package rpg.poo.model;
import rpg.poo.controller.Acao;

public abstract class Personagem implements Acao{
    protected String nome;
    protected int nivel = 1;
    protected int missoesConcluidas = 0;
    protected Raca raca;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
    
    @Override
    public void missoesDoNivel(int nivel){
        // serão listadas as missões para o nível do jogador
        // nível 1 = 3 inimigos
        // nivel 2 = 4 
        // nivel 3 = 6
        // nivel 4 = 8
    }
    
    @Override
    public String exibeAtributos(){
        // lista todos atributos atuais do jogador
        return "Nível: "+nivel+
               "\nMissões concluídas: "+missoesConcluidas+
                "\nRaça: "+raca.getTipo()+
                "\nVida: "+raca.getVida()+
                "\nResistência mágica: "+raca.getResistenciaMagica()+
                "\nArmadura: "+raca.getArmadura()+
                "\nTenacidade: "+raca.getTenacidade()+
                "\nDado de habilidade: "+raca.getDanoDeHabilidade()+
                "\nPoder de habilidade: "+raca.getPoderDeHabilidade()+
                "\nVelocidade de ataque: "+raca.getVelocidadeDeAtaque();
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
