package rpg.poo.model;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadCombate extends Thread{
    private String ataque;
    private String nomeInimigo;
    private String nome;
    private int danoCausado;
    private int tempo;
    private int turno;
    
    public ThreadCombate (String ataque, String nomeInimigo, String nome, int tempo, int danoCausado, int turno){
        this.ataque = ataque;
        this.nomeInimigo = nomeInimigo;
        this.nome = nome;
        this.tempo = tempo;
        this.danoCausado = danoCausado;
        this.turno = turno;
        start();
    }
    
    @Override
    public void run(){
        try {
            if (turno == 1){
                System.out.println("Desferindo ataque!"); Thread.sleep(tempo);
                System.out.println("Você atacou com "+ataque+" e causou "+(danoCausado)+" de dano!"); Thread.sleep(tempo);
            } else if (turno == 2){
                System.out.println(nomeInimigo+" desferiu um ataque!"); Thread.sleep(tempo);
            } else {
                Thread.sleep(tempo);
            }
        } catch (InterruptedException error) {
            Logger.getLogger(ThreadCombate.class.getName()).log(Level.SEVERE, null, error);
        }
        if (turno == 1) System.out.println ("Sua vez de atacar!");
        else System.out.println("Vez de "+nomeInimigo+" atacar, prepare-se!");
    }
}
