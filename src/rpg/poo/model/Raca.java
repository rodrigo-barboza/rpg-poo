
package rpg.poo.model;

public class Raca extends Personagem{
        //Atributos da classe Raca
        private String atributo;
        private int vida;
        private int resistenciaMagica;
        private int armadura;
        private int tenacidade;
        private int danoDeHabilidade;
        private int poderDeHabilidade;
        private int velocidadeDeAtaque;


    //Getters e Setters dos atributos
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getTenacidade() {
        return tenacidade;
    }

    public void setTenacidade(int tenacidade) {
        this.tenacidade = tenacidade;
    }

    public int getDanoDeHabilidade() {
        return danoDeHabilidade;
    }

    public void setDanoDeHabilidade(int danoDeHabilidade) {
        this.danoDeHabilidade = danoDeHabilidade;
    }

    public int getPoderDeHabilidade() {
        return poderDeHabilidade;
    }

    public void setPoderDeHabilidade(int poderDeHabilidade) {
        this.poderDeHabilidade = poderDeHabilidade;
    }

    public int getVelocidadeDeAtaque() {
        return velocidadeDeAtaque;
    }

    public void setVelocidadeDeAtaque(int velocidadeDeAtaque) {
        this.velocidadeDeAtaque = velocidadeDeAtaque;
    }
}
