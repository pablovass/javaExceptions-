package com.pablovass.genericos;

public class App {
    public static void main(String[] args) {
     //   Clase<String> c = new Clase<String>("pablovass");
     //   c.mostrarTipo();
        Clase<String,Integer,Double,String>c =new Clase<>("hola",32,"pablo",32.1);
        c.mostrarTipo();
    }
}
