package rpg_poo.personagens;

public class Orc extends Personagem {

    //    Atributos
    private boolean poder;
    private boolean escudo;
    private int defesa;

//    Construtor
    public Orc(String nomePersonagem, int pontosDeVida) {
        super(nomePersonagem, pontosDeVida);
    }

//    Getters and Setters
    public boolean getPoder() {
        return poder;
    }

    public void setPoder(boolean poder) {
        this.poder = poder;
    }

    public boolean getEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    //    Métodos
    public void atacar() {
        this.setAtaque(50);
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
