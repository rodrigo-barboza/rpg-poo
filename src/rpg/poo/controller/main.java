package rpg.poo.controller;
import rpg.poo.model.*;
import java.util.Scanner;

public class main {
    public static char escolhido;
    public static void main(String[] args){        
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: Personagem esc = criaPersonagem(); 
                    System.out.println("Nome: "+esc.getNome());
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
                    escolhido = 'A'; 
                    System.out.print("Você criou um assassino. \nnome:"); 
                    
                    input.nextLine();
                    String nomeA = input.nextLine();
                    playerA.setNome(nomeA);   
                    
                    return playerA;
            case 2: Personagem playerG = new Guerreiro(); 
                    escolhido = 'G'; 
                    System.out.print("Você criou um guerreiro. \nnome:"); 
                    
                    input.nextLine();
                    String nomeG = input.nextLine();
                    playerG.setNome(nomeG); 
                    
                    return playerG;
            case 3: Personagem playerM = new Mago(); 
                    escolhido = 'M';
                    System.out.print("Você criou um mago. \nnome:"); 
                    
                    input.nextLine();
                    String nomeM = input.nextLine();
                    playerM.setNome(nomeM); 
                    
                    return playerM;
            default: System.out.println("\n\tOpção inválida. "); return null;
        }
    }
}
