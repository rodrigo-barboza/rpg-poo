package rpg.poo.controller;

public interface Combate { // RD
    void lutar(int nivel, int missaoEscolhida);
    void usarHabilidadeEspecial(int danoDaHabilidade, int vidaInimigo);
    void usarAtaqueBasico(int vidaInimigo);
}
