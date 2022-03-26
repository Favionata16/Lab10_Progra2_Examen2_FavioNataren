/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Progra2_FavioNataren_22141210;

import java.io.Serializable;

/**
 *
 * @author favio
 */
public class terrestres extends planetas implements Serializable {

    public terrestres(int tamanio, int peso, String nombre, int x, int y) {
        super(tamanio, peso, nombre, x, y);
    }

    public terrestres() {
    }

}
