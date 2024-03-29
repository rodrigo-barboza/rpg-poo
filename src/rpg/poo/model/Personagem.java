package rpg.poo.model;
import rpg.poo.controller.Acao;
import rpg.poo.controller.Constantes;
import rpg.poo.model.inimigos.Inimigos;
import java.util.Scanner;

public abstract class Personagem implements Acao, Constantes{
    protected String nome;
    protected int nivel = 1;
    protected int missoesConcluidas = 0;
    protected Raca raca;
    protected Inimigos inimigo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
    
    @Override
    public String missoesDoNivel(){
        // serão listadas as missões para o nível do jogador
        // nível 1 = 3 inimigos
        // nivel 2 = 4 
        // nivel 3 = 6
        // nivel 4 = 8
        Inimigos inimigos = new Inimigos();
        String n1,n2,n3,n4,n5,n6,n7,n8;
        n1 = n2 = n3 = n4 = n5 = n6 = n7 = n8 = "void";
        inimigo = inimigos;
        
        switch(nivel){
            case 1:
                System.out.println("Missões do Nível "+nivel + ": ");
                n1 = inimigos.getMissaoIn(nivel);
                System.out.print("\nMissão 1: "+n1);
                n2 = inimigos.getMissaoIn(nivel);
                while(n2.equals(n1)){
                    n2 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 2: "+n2);
                n3 = inimigos.getMissaoIn(nivel);
                while(n3.equals(n2) || n3.equals(n1)){
                    n3 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 3: "+n3);
                break;
    
            case 2:
                System.out.print("Missões do Nível "+nivel + ": ");
                n1 = inimigos.getMissaoIn(nivel);
                System.out.print("\nMissão 1: "+n1);
                
                n2 = inimigos.getMissaoIn(nivel);
                while(n2.equals(n1)){
                    n2 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 2: "+n2);
                
                n3 = inimigos.getMissaoIn(nivel);
                while(n3.equals(n2) || n3.equals(n1)){
                    n3 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 3: "+n3);
                
                n4 = inimigos.getMissaoIn(nivel);
                while(n4.equals(n1) || n4.equals(n2) || n4.equals(n3)){
                    n4 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 4: "+n4);
                break;
                
            case 3:
                System.out.print("Missões do Nível "+nivel + ": ");
                n1 = inimigos.getMissaoIn(nivel);
                System.out.print("\nMissão 1: "+n1);
                
                n2 = inimigos.getMissaoIn(nivel);
                while(n2.equals(n1)){
                    n2 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 2: "+n2);
                
                n3 = inimigos.getMissaoIn(nivel);
                while(n3.equals(n2) || n3.equals(n1)){
                    n3 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 3: "+n3);
                
                n4 = inimigos.getMissaoIn(nivel);
                while(n4.equals(n1) || n4.equals(n2) || n4.equals(n3)){
                    n4 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 4: "+n4);
                
                n5 = inimigos.getMissaoIn(nivel);
                while(n5.equals(n1) || n5.equals(n2) || n5.equals(n3) || n5.equals(n4)){
                    n5 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 5: "+n5);
                
                n6 = inimigos.getMissaoIn(nivel);
                while(n6.equals(n1) || n6.equals(n2) || n6.equals(n3) || n6.equals(n4) || n6.equals(n5)){
                    n6 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 6: "+n6);
                break;
                
            case 4:
                System.out.print("Missões do Nível "+nivel + ": ");
                n1 = inimigos.getMissaoIn(nivel);
                System.out.print("\nMissão 1: "+n1);
                
                n2 = inimigos.getMissaoIn(nivel);
                while(n2.equals(n1)){
                    n2 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 2: "+n2);
                
                n3 = inimigos.getMissaoIn(nivel);
                while(n3.equals(n2) || n3.equals(n1)){
                    n3 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 3: "+n3);
                
                n4 = inimigos.getMissaoIn(nivel);
                while(n4.equals(n1) || n4.equals(n2) || n4.equals(n3)){
                    n4 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 4: "+n4);
                
                n5 = inimigos.getMissaoIn(nivel);
                while(n5.equals(n1) || n5.equals(n2) || n5.equals(n3) || n5.equals(n4)){
                    n5 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 5: "+n5);
                
                n6 = inimigos.getMissaoIn(nivel);
                while(n6.equals(n1) || n6.equals(n2) || n6.equals(n3) || n6.equals(n4) || n6.equals(n5)){
                    n6 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 6: "+n6);
                
                n7 = inimigos.getMissaoIn(nivel);
                while(n7.equals(n1) || n7.equals(n2) || n7.equals(n3) || n7.equals(n4) || n7.equals(n5) || n7.equals(n6) ){
                    n7 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 7: "+n7);
                
                n8 = inimigos.getMissaoIn(nivel);
                while(n8.equals(n1) || n8.equals(n2) || n8.equals(n3) || n8.equals(n4) || n8.equals(n5) || n8.equals(n6) || n8.equals(n7) ){
                    n8 = inimigos.getMissaoIn(nivel);
                }
                System.out.print("\nMissão 8: "+n8);
                break;
        }
        
        System.out.print("\n\n\t=> ");
        
        Scanner input = new Scanner(System.in);
        int missao = input.nextInt();
        
        switch(nivel){
            case 1:
                switch(missao){
                    case 1: return n1;
                    case 2: return n2;
                    case 3: return n3;
                } 
                break;
            case 2:
                switch(missao){
                    case 1: return n1;
                    case 2: return n2;
                    case 3: return n3;
                    case 4: return n4;
                } 
                break;
            case 3:
                switch(missao){
                    case 1: return n1;
                    case 2: return n2;
                    case 3: return n3;
                    case 4: return n4;
                    case 5: return n5;
                    case 6: return n6;
                } 
                break;
            case 4: 
                switch(missao){
                    case 1: return n1;
                    case 2: return n2;
                    case 3: return n3;
                    case 4: return n4;
                    case 5: return n5;
                    case 6: return n6;
                    case 7: return n7;
                    case 8: return n8;
                } 
                break;
        }
        return "void"; // só pra a frescura do java parar de arretar
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
               "\nDado de habilidade: "+raca.getDanoDeHabilidade()+
               "\nVelocidade de ataque: "+raca.getVelocidadeDeAtaque();
    }
    
    @Override
    public void missaoCompleta(){
        // incrementa o número de missões concluidas para o jogador e verifica se o mesmo subiu de nível
        missoesConcluidas++;
        if(missoesConcluidas == 3 || missoesConcluidas == 7 || missoesConcluidas == 13 || missoesConcluidas == 21){
            //subiuNivel();
            nivel++;
            
            if(raca.getTipo() == "Mago"){
                raca.setVida(VIDA_MAGO +(nivel*CONST_VIDA_MAGO));
                raca.setResistenciaMagica(RES_MAGIC_MAGO+(nivel*CONST_RES_MAGIC_MAGO));
                raca.setArmadura(ARMADURA_MAGO+(nivel*CONST_ARMADURA_MAGO));
                raca.setVelocidadeDeAtaque(VEL_ATQ_MAGO+(nivel*CONST_VEL_ATQ_MAGO));
                raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_MAGO +(nivel*CONST_DANO_DE_HABILIDADE_MAGO));
            }else if(raca.getTipo()=="Guerreiro"){
                raca.setVida(VIDA_GUERREIRO +(nivel*CONST_VIDA_GUERREIRO));
                raca.setResistenciaMagica(RES_MAGIC_GUERREIRO +(nivel*CONST_RES_MAGIC_GUERREIRO));
                raca.setArmadura(ARMADURA_GUERREIRO +(nivel*CONST_ARMADURA_GUERREIRO));
                raca.setVelocidadeDeAtaque(VEL_ATQ_GUERREIRO +(nivel*CONST_VEL_ATQ_GUERREIRO));
                raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_GUERREIRO +(nivel*CONST_DANO_DE_HABILIDADE_GUERREIRO));
            }else if(raca.getTipo()=="Assassino"){
                raca.setVida(VIDA_ASSASSINO +(nivel*CONST_VIDA_ASSASSINO));
                raca.setResistenciaMagica(RES_MAGIC_ASSASSINO +(nivel*CONST_RES_MAGIC_ASSASSINO));
                raca.setArmadura(ARMADURA_ASSASSINO +(nivel*CONST_ARMADURA_ASSASSINO));
                raca.setVelocidadeDeAtaque(VEL_ATQ_ASSASSINO +(nivel*CONST_VEL_ATQ_ASSASSINO));
                raca.setDanoDeHabilidade(DANO_DE_HABILIDADE_ASSASSINO +(nivel*CONST_DANO_DE_HABILIDADE_ASSASSINO));
            }
        }
    }
    
    @Override
    public void subiuNivel(){
        System.out.println("ENTROU NESSA PORRA????????");
        // incrementa o nível do jogador e atualiza os atributos do mesmo
        // Falta pro Dano, e pra habilidades para cada Classe
        
    }
    
}
