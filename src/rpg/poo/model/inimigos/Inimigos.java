package rpg.poo.model.inimigos;

import java.util.Random;

public class Inimigos { // PC
    // colocar os inimigos e seus atributos
    //Pensando que os inimigos vão chegar com o nível da missão, vamos possuir o seguinte:
    //Atributos:
    private String nomeIn;
    private int vidaIn;
    private int resistenciaMagicaIn;
    private int armaduraIn;
    private int danoDeHabilidade;
    private String tipoIn; // TIPO de dano do inimigo: "fisico" ou "magico"
    //private int velocidadeDeAtaque; // ver se vai botar esse aqui ainda
    
    //nome da fase do inimigo:
    private String missaoIn;
    
    
    private void definirInimigo(int nivelDoAventureiro){
        int limite;
        int aleatorio;
        Random rand = new Random();
        
        switch(nivelDoAventureiro){
            case 1: //inimigos de nível 1:
                limite=2;
                aleatorio = rand.nextInt(limite);
                switch(aleatorio){
                    case 0:
                        setNomeIn("Orc Perneta");
                        setVidaIn(140);
                        setArmaduraIn(12);
                        setDanoDeHabilidade(15);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(5);
                        break;
                    case 1:
                        setNomeIn("Bruxo aprendiz");
                        setVidaIn(90);
                        setArmaduraIn(6);
                        setDanoDeHabilidade(20);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(12);
                        break;
                    default:
                        setNomeIn("O Incompreensivel 1");
                        setVidaIn(9999);
                        setArmaduraIn(9999);
                        setDanoDeHabilidade(10);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(9999);
                }
                break;
                
            case 2: // inimigos de nível 2, mais difíceis q os de nível 1 mas não tanto e tals
                limite=3;
                aleatorio = rand.nextInt(limite);
                switch(aleatorio){
                    case 0:
                        setNomeIn("Mago Leigo");
                        setVidaIn(175);
                        setArmaduraIn(10);
                        setDanoDeHabilidade(30);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(20);
                        break;
                    case 1:
                        setNomeIn("Anao Sentimental");
                        setVidaIn(220);
                        setArmaduraIn(18);
                        setDanoDeHabilidade(25);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(12);
                        break;
                    case 2:
                        setNomeIn("Arqueiro em Treinamento");
                        setVidaIn(150);
                        setArmaduraIn(15);
                        setDanoDeHabilidade(35);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(15);
                        break;
                    default:
                        setNomeIn("O Incompreensivel 2");
                        setVidaIn(9999);
                        setArmaduraIn(9999);
                        setDanoDeHabilidade(10);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(9999);
                }
                break;
                //case 3 são os inimigos de nível 3, os que começam a ficar mais perigosos pro jogador
            case 3:
                limite = 4;
                aleatorio = rand.nextInt(limite);
                switch(aleatorio){
                    case 0:
                        setNomeIn("Bruxo Treinado");
                        setVidaIn(200);
                        setArmaduraIn(20);
                        setDanoDeHabilidade(35);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(40);
                        break;
                    case 1:
                        setNomeIn("Mago Malvado");
                        setVidaIn(250);
                        setArmaduraIn(25);
                        setDanoDeHabilidade(28);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(35);
                        break;
                    case 2:
                        setNomeIn("Orc Raivoso");
                        setVidaIn(300);
                        setArmaduraIn(35);
                        setDanoDeHabilidade(35);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(25);
                        break;
                    case 3:
                        setNomeIn("Elfo Cacador");
                        setVidaIn(260);
                        setArmaduraIn(25);
                        setDanoDeHabilidade(40);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(25);
                        break;
                    default:
                        setNomeIn("O Incompreensivel 3");
                        setVidaIn(9999);
                        setArmaduraIn(9999);
                        setDanoDeHabilidade(10);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(9999);
                }
                break;
                //inimigos de case 4 são os mais difíceis e que darão mto trabalho pro jogador derrotar
            case 4:
                limite = 5;
                aleatorio = rand.nextInt(limite);
                switch(aleatorio){
                    case 0:
                        setNomeIn("Mago Experiente");
                        setVidaIn(300);
                        setArmaduraIn(30);
                        setDanoDeHabilidade(40);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(60);
                        break;
                    case 1:
                        setNomeIn("Bruxo Demoniaco");
                        setVidaIn(350);
                        setArmaduraIn(25);
                        setDanoDeHabilidade(35);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(45);
                        break;
                    case 2:
                        setNomeIn("Orc General");
                        setVidaIn(500);
                        setArmaduraIn(50);
                        setDanoDeHabilidade(45);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(30);
                        break;
                    case 3:
                        setNomeIn("Elfo Assassino");
                        setVidaIn(350);
                        setArmaduraIn(34);
                        setDanoDeHabilidade(40);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(34);
                        break;
                    case 4:
                        setNomeIn("Dragao de Fogo");
                        setVidaIn(700);
                        setArmaduraIn(60);
                        setDanoDeHabilidade(50);
                        setTipoIn("magico");
                        setResistenciaMagicaIn(20);
                        break;
                    default:
                        setNomeIn("O Incompreensivel 4");
                        setVidaIn(9999);
                        setArmaduraIn(9999);
                        setDanoDeHabilidade(10);
                        setTipoIn("fisico");
                        setResistenciaMagicaIn(9999);
                }
                break;
                //Valores default pra se der erro em algum switch
            default:
                //vou zoar aqui KKKKK
                //Se der erro em pegar o inimigo, o inimigo vai ser invencível, bom pra testes, que dá pouco dano
                //Isso vai se repetir pra cada um dos switchs dentro dos switchs tbm
                setNomeIn("O Incompreensivel 0");
                setVidaIn(9999);
                setArmaduraIn(9999);
                setDanoDeHabilidade(10);
                setTipoIn("fisico");
                setResistenciaMagicaIn(9999);
        }
    }
    
    public String getMissaoIn(int nivelDoAventureiro) {
        definirInimigo(nivelDoAventureiro); //Aqui ele já vai escolher o inimigo baseado no nível do jogador

        String nomeMissao = null; // o nome da missão vai ficar aqui
        if(getNomeIn().equals("Dragao de Fogo")){
            nomeMissao = "O Covil do Dragao de Fogo";
            return nomeMissao;
        }
        else{
            // atributos pra pegar uma fase aleatória
            int aleatorio;
            Random rand = new Random();
            aleatorio = rand.nextInt(9);
            switch(aleatorio){
                case 0:
                    nomeMissao = "O Covil do " + getNomeIn();
                    break;
                case 1:
                    nomeMissao = "A Floresta do " + getNomeIn();
                    break;
                case 2:
                    nomeMissao = "O Castelo Ancestral do " + getNomeIn();
                    break;
                case 3:
                    nomeMissao = "A Mansao Amaldicoada do " + getNomeIn();
                    break;
                case 4:
                    nomeMissao = "A Arena do " + getNomeIn();
                    break;
                case 5:
                    nomeMissao = "O Esconderijo do " + getNomeIn();
                    break;
                case 6:
                    nomeMissao = "A academia do " + getNomeIn();
                    break;
                case 7:
                    nomeMissao = "A Rua dominada pelo " + getNomeIn();
                    break;
                case 8:
                    nomeMissao = "A Montanha tomada pelo " + getNomeIn();
                    break;    
                default:
                    nomeMissao = "O vazio do " + getNomeIn();
            }
        }
        return nomeMissao;
    }

    
    
    //Métodos especiais getters e setters pros atributos dos inimigos
    public int getVidaIn() {
        return vidaIn;
    }

    public void setVidaIn(int vidaIn) {
        this.vidaIn = vidaIn;
    }

    public int getResistenciaMagicaIn() {
        return resistenciaMagicaIn;
    }

    public void setResistenciaMagicaIn(int resistenciaMagicaIn) {
        this.resistenciaMagicaIn = resistenciaMagicaIn;
    }

    public int getArmaduraIn() {
        return armaduraIn;
    }

    public void setArmaduraIn(int armaduraIn) {
        this.armaduraIn = armaduraIn;
    }

    public int getDanoDeHabilidade() {
        return danoDeHabilidade;
    }

    public void setDanoDeHabilidade(int danoDeHabilidade) {
        this.danoDeHabilidade = danoDeHabilidade;
    }

    public String getTipoIn() {
        return tipoIn;
    }

    public void setTipoIn(String tipoIn) {
        this.tipoIn = tipoIn;
    }

    public String getNomeIn() {
        return nomeIn;
    }

    public void setNomeIn(String nomeIn) {
        this.nomeIn = nomeIn;
    }

    public void setMissaoIn(String missaoIn) {
        this.missaoIn = missaoIn;
    }
    
}
