/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_poo;

import rpg_poo.personagens.Humano;

/**
 *
 * @author mikae
 */
public class Rpg_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Humano h = new Humano("Mikael", 100);
        
        h.status();
        h.atacar();
        h.status();

        
        
    }
    
}
