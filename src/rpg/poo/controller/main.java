package rpg.poo.controller;
import rpg.poo.model.*;

public class main {
    public static void main(String[] args) {
        // criar um personagem da raça guerreiro
        Guerreiro player_01 = new Guerreiro();
        
        player_01.setNome("Wolfang");
        System.out.println("Nome: "+player_01.getNome());
        System.out.println("Atributo: "+player_01.getAtributo());
        System.out.println("Armadura: "+player_01.getArmadura());
        System.out.println("Dano de Habilidade: "+player_01.getDanoDeHabilidade());
        System.out.println("Resistência Mágica: "+player_01.getResistenciaMagica());
        System.out.println("Tenacidade: "+player_01.getTenacidade());
        System.out.println("Velocidade de Ataque: "+player_01.getVelocidadeDeAtaque());
        System.out.println("Vida: "+player_01.getVida());
    }
}
