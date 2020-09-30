/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD_Template;

/**
 *
 * @author Pepe Pateatraseros
 */
public class Main {
    public static void main (String[]args){
        Mid m = new Mid();
        Adc a = new Adc();
        m.jugadorRandom();
        a.jugadorRandom();
        m.mostrarDatos();
        System.out.println("");
        a.mostrarDatos();
        
    }
}
