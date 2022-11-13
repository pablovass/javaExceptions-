package com.pablovass.exepciones_1;

import javax.swing.*;

public class fallos {
    public static void main(String[] args) {

        int []mi_matriz =new int [5];
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;
        mi_matriz[5]=71;
        for(int i=0 ; i<5; i++){
            System.out.println( "posicion "+ i+ " = " +mi_matriz[i]);
        }
        //peticion de datos personales
        String nombre= JOptionPane.showInputDialog("introduce tu nombre ");
        int edad =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        System.out.println("Hola "+ nombre +" Tienes " + edad+ " años "+ " el programa se termino de ejecutar ");

        /** es una exepcion no comprobada  // porque yo cometi el error .
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
         * 	at com.pablovass.exepciones_1.fallos.main(fallos.java:14)
         */

    }
}
