package rpg.poo.controller;

public interface Combate { // RD
    void iniciarMissao(String missaoEscolhida);
    int ataqueInimigo(int vida);
    void defenderAtaqueInimigo();
    int usarHabilidadeEspecial(int danoDaHabilidade, int vidaInimigo);
    int usarAtaqueBasico(int vidaInimigo);
    void escolherAcao();
}
