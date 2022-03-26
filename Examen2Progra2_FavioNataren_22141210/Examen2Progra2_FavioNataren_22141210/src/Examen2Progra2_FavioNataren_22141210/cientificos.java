/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Progra2_FavioNataren_22141210;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author favio
 */
public class cientificos implements Serializable {

    String nombre;
    ArrayList<planetas> pla = new ArrayList();

    public cientificos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<planetas> getPla() {
        return pla;
    }

    public void setPla(planetas pla) {
        this.pla.add(pla);
    }

}
