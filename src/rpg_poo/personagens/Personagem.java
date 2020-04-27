package rpg_poo.personagens;

public abstract class Personagem {

    //    Atributos
    String nomePersonagem;
    int pontosDeVida;
    int ataque;

//    Construtor
    public Personagem(String nomePersonagem, int pontosDeVida) {

        this.setNomePersonagem(nomePersonagem);
        this.setPontosDeVida(pontosDeVida);
//        this.setAtaque(ataque);
    }

//    Métodos
//    Getters and Setters
    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
