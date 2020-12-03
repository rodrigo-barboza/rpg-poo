package rpg.poo.controller;
import java.util.Scanner;
import rpg.poo.model.Assassino;
import rpg.poo.model.Guerreiro;
import rpg.poo.model.Mago;

public class Jogo{
    protected Assassino assassino;
    protected Guerreiro guerreiro;
    protected Mago mago;
    protected int numPersonagens = -1;
    
    public void menuJogo(Assassino player){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Missões"); // chama o método missoesDoNivel()
        System.out.println("2 - Meus atributos"); // chama o método exibeAtributos();
        System.out.println("3 - Voltar para o menu principal\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: 
                    String missaoEscolhida = player.missoesDoNivel();
                    //String missaoEscolhida = null;
                    player.iniciarMissao(missaoEscolhida);
                    menuJogo(player);
                    break;
            case 2: System.out.println(player.exibeAtributos());
                    menuJogo(player); break;
            case 3: menuPrincipal();
        }
    }
    
    public void menuJogo(Guerreiro player){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Missões"); // chama o método missoesDoNivel()
        System.out.println("2 - Meus atributos"); // chama o método exibeAtributos();
        System.out.println("3 - Voltar para o menu principal\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: String missaoEscolhida = player.missoesDoNivel();
                    player.iniciarMissao(missaoEscolhida);
                    menuJogo(player);
                    //persona
                    break;
            case 2: System.out.println(player.exibeAtributos());
                    menuJogo(player); break;
            case 3: menuPrincipal();
        }
        
    }
    
    public void menuJogo(Mago player){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Missões"); // chama o método missoesDoNivel()
        System.out.println("2 - Meus atributos"); // chama o método exibeAtributos();
        System.out.println("3 - Voltar para o menu principal\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: String missaoEscolhida = player.missoesDoNivel();
                    player.iniciarMissao(missaoEscolhida);
                    menuJogo(player);
                    //persona
                    break;
            case 2: System.out.println(player.exibeAtributos()); 
                    menuJogo(player); break;
            case 3: menuPrincipal();
        }
        
    }
    
    /*public void voltarMenuJogo(){
        System.out.println("Deseja voltar ao menu do jogo? ");
        System.out.println("1 - Sim / 2 - Não\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        if (op == 1) menuJogo(playerM);
        else menuPrincipal();        
    }
    */
    public static void criaPersonagem(){
        Jogo jogo = new Jogo();
        jogo.numPersonagens++;
        
        System.out.println("\nESCOLHA A SUA CLASSE-----------------------------\n");
        System.out.println("1 - Assassino");
        System.out.println("2 - Guerreiro");
        System.out.println("3 - Mago");
        System.out.println("4 - Voltar para o menu principal\n");
        
        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: Assassino playerA = new Assassino(); 
                    System.out.print("Você criou um assassino. \nnome:"); 
                    
                    input.nextLine();
                    String nomeA = input.nextLine();
                    playerA.setNome(nomeA);   
                    
                    jogo.assassino = playerA;
                    jogo.menuJogo(jogo.assassino);
                    
                    break;
            case 2: Guerreiro playerG = new Guerreiro(); 
                    System.out.print("Você criou um guerreiro. \nnome:"); 
                    
                    input.nextLine();
                    String nomeG = input.nextLine();
                    playerG.setNome(nomeG); 
                    
                    jogo.guerreiro = playerG;
                    jogo.menuJogo(jogo.guerreiro);
                    
                    break;
            case 3: Mago playerM = new Mago(); 
                    System.out.print("Você criou um mago. \nnome:"); 
                    
                    input.nextLine();
                    String nomeM = input.nextLine();
                    playerM.setNome(nomeM); 
                    
                    jogo.mago = playerM;
                    jogo.menuJogo(jogo.mago);
                    
                    break;
            case 4: menuPrincipal(); 
            default: System.out.println("\n\tOpção inválida. "); menuPrincipal(); 
        }
    }
    
    public static void menuPrincipal (){
        System.out.println("\nMENU --------------------------------------------\n");
        System.out.println("1 - Novo jogo");
        System.out.println("2 - Sair\n");

        Scanner input = new Scanner(System.in);
        int op = input.nextInt();
        
        switch(op){
            case 1: 
                   criaPersonagem();                    
                   break;
            case 2: break;
        }
    }
    
     public static void main(String[] args){        
        menuPrincipal();
    }
}
