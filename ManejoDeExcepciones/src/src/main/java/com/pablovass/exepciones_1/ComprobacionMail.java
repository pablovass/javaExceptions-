package com.pablovass.exepciones_1;

import javax.swing.*;

public class ComprobacionMail {
    public static void main(String[] args) {

        String elMAil = JOptionPane.showInputDialog("Introduce mail");
        try{
            examinaMail(elMAil);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" la direccion del mail no es correcta");
        }

    }

    private static void examinaMail(String mail) throws ArrayIndexOutOfBoundsException {
        int arroba = 0;
        boolean punto = false;

        if (mail.length() <= 3) {
         //   ArrayIndexOutOfBoundsException myExeption = new ArrayIndexOutOfBoundsException();
         //   throw myExeption; aca estoy probocando una exepcion si o si .
            throw  new ArrayIndexOutOfBoundsException();
        } else {


            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba++;

                }
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (arroba == 1)&& (punto==true) {
                System.out.println("es correcto");
            }
        else{
                System.out.println("no es correcto");
            }
        }
    }

}
