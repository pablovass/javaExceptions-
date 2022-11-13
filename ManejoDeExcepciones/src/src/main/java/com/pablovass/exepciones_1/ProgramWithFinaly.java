package com.pablovass.exepciones_1;

import javax.swing.*;
import java.util.Scanner;

public class ProgramWithFinaly {
    static int figura;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("elige una opcion :\n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
        try{
          figura = entrada.nextInt();
        }catch (Exception e){
            System.out.println("ha ocurrido un error");
        }finally { // se va ajecutar siempre
            entrada.close(); // si o si hay que cerrar el objeto
        }

        switch (figura) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
                System.out.println(Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
                System.out.println((base * altura));
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));

                System.out.println((Math.pow(base, altura)) / 2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("introduce radio"));
                System.out.println("el area del circulo es ");
                System.out.println(Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opcion es incorrecta");
        }
       //  el otro programa       */
        int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm "));
        System.out.println("si eres hombre tu peso ideal es " + (altura - 110) + " kg");
        System.out.println("si eres mujer tu peso ideal es " + (altura - 120) + " kg");

    }
}
