package rpg_poo.personagens;

import java.util.Random;

public class Humano extends Personagem {

//    Atributos
    private boolean poder;
    private boolean escudo;
    private int defesa;

//    Construtor
    public Humano(String nomePersonagem, int pontosDeVida) {
        super(nomePersonagem, pontosDeVida);
//        this.setPontosDeVida(pontosDeVida);
//        this.setPoder(poder);
        this.setEscudo(escudo);
        this.setDefesa(defesa);
    }

//    Getters and Setters
    private boolean getPoder() {
        return poder;
    }

    public void setPoder(boolean poder) {
        this.poder = poder;
    }

    private boolean getEscudo() {
        return escudo;
    }

    private void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    private int getDefesa() {
        return defesa;
    }

    private void setDefesa(int defesa) {
        this.defesa = defesa;
    }

//    Métodos
    public void atacar() {
        this.setAtaque(25);
    }

    public void receberAtaque() {

        if (this.getDefesa() > 0 && getPontosDeVida() > 0) {
            this.setAtaque(this.getAtaque() - defesa);
            this.setPontosDeVida(this.getPontosDeVida() - this.getAtaque());
        } else {
            System.out.println("Você está morto!");
        }
    }

    public void status() {
        System.out.println("Pontos de vida " + this.getPontosDeVida());
        System.out.println("Valor de ataque: " + this.getAtaque());
    }
}
