/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Progra2_FavioNataren_22141210;

import javax.swing.JProgressBar;

/**
 *
 * @author favio
 */
public class hilo implements Runnable {

    JProgressBar barra;
    int valor;

    public hilo(JProgressBar H, int valor) {
        this.barra = H;
        this.valor = valor;

    }

    @Override
    public void run() {
        int pass = 0;
        System.out.println(pass + "   " + valor);
        while (pass <= valor) {
            barra.setValue(barra.getValue() + 1);
            pass++;
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }
        barra.setValue(0);

    }
}
