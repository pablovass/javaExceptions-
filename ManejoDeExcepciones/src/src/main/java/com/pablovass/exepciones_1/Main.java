package com.pablovass.exepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // esto es la forma correcta para atrapar la exepcion
        try {
            pedirDatos();
        }catch (InputMismatchException e){
            System.out.println("esta mal escrito la edad o el nombre ");
        }


    }
    // el throws  captura el error
    // el try catch si lo captura
    static  void pedirDatos()throws InputMismatchException {
       // try {
            Scanner entrada = new Scanner(System.in);
            System.out.println( "introduce tu nombre, please");
            String nombre= entrada.nextLine();
            System.out.println( "introduce tu edad, please");
            int edad= entrada.nextInt();
            System.out.println( "hola "+ nombre+" el año que viene tendras "+(edad+1)+ " años");


    //   }catch (InputMismatchException e){
    //       System.out.println("esta mal escrito la edad o el nombre ");
    //   }
        System.out.println( "el programa termino");
    }
    // es mi error y no estoy obligado a usar un try catch
    // pero puedo hacerlo igual pero no es una buena practica

    /* es un error no comprovado
    * Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at com.pablovass.exepciones_1.Main.pedirDatos(Main.java:17)
	at com.pablovass.exepciones_1.Main.main(Main.java:9)
	* */
    /**
     * una buena practica es capturar la excepcion fuera del metodo
     * y dentro del metod
     */
    /**
     * throws  indicamos este metodo podria lanzar una exepcion
     * throw lanzame una exepcion
     */
}