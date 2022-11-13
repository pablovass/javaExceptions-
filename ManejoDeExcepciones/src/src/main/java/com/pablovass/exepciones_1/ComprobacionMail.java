package com.pablovass.exepciones_1;

import javax.swing.*;

public class ComprobacionMail {

    public static void main(String[] args) {

        // String elMAil = JOptionPane.showInputDialog("Introduce mail");
        // try{
        //     examinaMail(elMAil);
        // }catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println(" la direccion del mail no es correcta");
        // }
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("no se permite la exepcion por cero");
        } catch (NumberFormatException e) {
            System.out.println(" No has introducido un numero entero");
            System.out.println(e.getMessage());// nos va devolver un string que nos va decir que es .
            System.out.println(" se ha generado un erro de este tipo"+e.getClass().getName());
            //getMessage();
            //getClass();
            //getName();
        }


    }

    private static void examinaMail(String mail) throws ArrayIndexOutOfBoundsException {
        int arroba = 0;
        boolean punto = false;

        if (mail.length() <= 3) {
            //   ArrayIndexOutOfBoundsException myExeption = new ArrayIndexOutOfBoundsException();
            //   throw myExeption; aca estoy probocando una exepcion si o si .
            throw new ArrayIndexOutOfBoundsException();
        } else {


            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;

                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }
            if ((arroba == 1) && (punto == true)) {
                System.out.println("es correcto");
            } else {
                System.out.println("no es correcto");
            }
        }
    }

    private static void division() {
        int numeroDividendo = Integer.parseInt(JOptionPane.showInputDialog("introduce el dividendo"));
        int numeroDivisor = Integer.parseInt(JOptionPane.showInputDialog("introduce el divisor"));
        System.out.println("El resultado " + numeroDividendo / numeroDivisor);

    }

}
