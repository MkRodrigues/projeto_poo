package rpg_poo;

import Interfaces.Acoes;
import java.util.Random;
import rpg_poo.personagens.Humano;
import rpg_poo.personagens.Dragao;
import rpg_poo.personagens.Orc;

public class Luta implements Acoes {

//    Atributos
    private Humano humano;
    private Dragao dragao;
    private Orc orc;

    @Override
    public void escolherAdversario() {
        Random playerAleat = new Random();
        int jogador = playerAleat.nextInt(3);

        switch (jogador) {
            case 0:
                this.humano.getNomePersonagem();
                break;

            case 1:
                this.dragao.getNomePersonagem();
                break;

            case 2:
                this.orc.getNomePersonagem();
                break;
        }
    }

    @Override
    public void lutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void perder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void empatar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
