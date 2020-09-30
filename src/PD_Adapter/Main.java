/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PD_Adapter;

/**
 *
 * @author Pepe Pateatraseros
 */
public class Main {

    public static void main(String[] args) {
        int arma, accion;
        ArmaConFlecha arco1= new ArmaConFlecha();;
        Revolver revolver1 = new Revolver();
        char respuesta;
        do{
            System.out.println("Elija un arma:");
            System.out.println("1.Arco.");
            System.out.println("2.Revolver.");
            arma = TecladoIn.readLineInt();
        
            if(arma == 1){
                do{
                    System.out.println("Elija su accion:");
                    System.out.println("1.Disparar el Arco");
                    System.out.println("2.Colocar una flecha");
                    accion = TecladoIn.readLineInt();
                    if(accion == 1){
                        arco1.disparar();
                    }
                    else{
                        arco1.recargar();
                    }
                    System.out.println("Quiere volver a usar el arco? (s/n)");
                    respuesta = TecladoIn.readLineNonwhiteChar();
                }while(respuesta == 's');
            }
            else{
                do{
                    System.out.println("Elija su accion:");
                    System.out.println("1.Disparar el Revolver");
                    System.out.println("2.Recargar el arma");
                    accion = TecladoIn.readLineInt();
                    if(accion == 1){
                        revolver1.disparar();
                    }
                    else{
                        revolver1.recargar();
                    }
                    System.out.println("Quiere volver a usar el revolver? (s/n)");
                    respuesta = TecladoIn.readLineNonwhiteChar();
                }while(respuesta == 's');
            }
            System.out.println("Quiere cambiar el arma? (s/n)");
            respuesta = TecladoIn.readLineNonwhiteChar();
        }while(respuesta == 's');
    }
    
}
