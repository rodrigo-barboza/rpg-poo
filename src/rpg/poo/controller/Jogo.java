package rpg.poo.controller;
import java.util.Scanner;
import rpg.poo.controller.Acao;
import rpg.poo.model.Assassino;
import rpg.poo.model.Guerreiro;
import rpg.poo.model.Mago;
import rpg.poo.model.Personagem;

public class Jogo{
    protected Personagem[] personagens = new Personagem[3];
    
    public void menu(){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Missões"); // chama o método missoesDoNivel()
        System.out.println("2 - Meus atributos\n"); // chama o método exibeAtributos();
    }
    
    public static void main(String[] args){        
        
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: 
                    Jogo jogo = new Jogo();
                    jogo.personagens[0] = criaPersonagem();
                    System.out.println("\n\n\tMeus atributos: "+jogo.personagens[0].exibeAtributos());
                    break;
            case 2: System.exit(1);
        }
    }
    
    public static Personagem criaPersonagem(){
        System.out.println("\nESCOLHA A SUA CLASSE-----------------------------\n");
        System.out.println("1 - Assassino");
        System.out.println("2 - Guerreiro");
        System.out.println("3 - Mago\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: Personagem playerA = new Assassino(); 
                    System.out.print("Você criou um assassino. \nnome:"); 
                    
                    input.nextLine();
                    String nomeA = input.nextLine();
                    playerA.setNome(nomeA);   
                    
                    return playerA;
            case 2: Personagem playerG = new Guerreiro(); 
                    System.out.print("Você criou um guerreiro. \nnome:"); 
                    
                    input.nextLine();
                    String nomeG = input.nextLine();
                    playerG.setNome(nomeG); 
                    
                    return playerG;
            case 3: Personagem playerM = new Mago(); 
                    System.out.print("Você criou um mago. \nnome:"); 
                    
                    input.nextLine();
                    String nomeM = input.nextLine();
                    playerM.setNome(nomeM); 
                    
                    return playerM;
            default: System.out.println("\n\tOpção inválida. "); return null;
        }
    }
}
