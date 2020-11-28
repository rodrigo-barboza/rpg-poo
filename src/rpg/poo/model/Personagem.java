package rpg.poo.model;
import rpg.poo.controller.Acao;
import rpg.poo.controller.Constantes;


public abstract class Personagem implements Acao,Constantes{
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
        switch(nivel){
            case 1:
                System.out.print("Missões do Nível "+nivel + ": ");
                System.out.print("\n");
            case 2:
                System.out.print("Missões do Nível "+nivel + ": ");
                
            case 3:
                System.out.print("Missões do Nível "+nivel + ": ");
                
            case 4:
                System.out.print("Missões do Nível "+nivel + ": ");
            
        }
        
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
        missoesConcluidas++;
        if(missoesConcluidas == 4){
            subiuNivel();
        }
    }
    
    @Override
    public void subiuNivel(){
        // incrementa o nível do jogador e atualiza os atributos do mesmo
        // Falta pro Dano, e pra habilidades para cada Classe
        nivel++;
        if(raca.getTipo()=="Mago"){
            raca.setVida(VIDA_MAGO +(nivel*CONST_VIDA_MAGO));
            raca.setResistenciaMagica(RES_MAGIC_MAGO+(nivel*CONST_RES_MAGIC_MAGO));
            raca.setArmadura(ARMADURA_MAGO+(nivel*CONST_ARMADURA_MAGO));
            raca.setVelocidadeDeAtaque(VEL_ATQ_MAGO+(nivel*CONST_VEL_ATQ_MAGO));
        }else if(raca.getTipo()=="Guerreiro"){
            raca.setVida(VIDA_GUERREIRO +(nivel*CONST_VIDA_GUERREIRO));
            raca.setResistenciaMagica(RES_MAGIC_GUERREIRO +(nivel*CONST_RES_MAGIC_GUERREIRO));
            raca.setArmadura(ARMADURA_GUERREIRO +(nivel*CONST_ARMADURA_GUERREIRO));
            raca.setVelocidadeDeAtaque(VEL_ATQ_GUERREIRO +(nivel*CONST_VEL_ATQ_GUERREIRO));
        }else if(raca.getTipo()=="Assassino"){
            raca.setVida(VIDA_ASSASSINO +(nivel*CONST_VIDA_ASSASSINO));
            raca.setResistenciaMagica(RES_MAGIC_ASSASSINO +(nivel*CONST_RES_MAGIC_ASSASSINO));
            raca.setArmadura(ARMADURA_ASSASSINO +(nivel*CONST_ARMADURA_ASSASSINO));
            raca.setVelocidadeDeAtaque(VEL_ATQ_ASSASSINO +(nivel*CONST_VEL_ATQ_ASSASSINO));
        }
    }
    
}
