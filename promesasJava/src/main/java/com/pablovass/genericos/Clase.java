package com.pablovass.genericos;

public class Clase<T, K, V, E> {
    private T objetoT;
    private K objetoK;
    private E objetoE;
    private V objetoV;

    public Clase(T objetoT, K objetoK, E objetoE, V objetoV) {
        this.objetoT = objetoT;
        this.objetoK = objetoK;
        this.objetoE = objetoE;
        this.objetoV = objetoV;
    }

    public Clase() {

    }

    public void mostrarTipo() {
        System.out.println("T es un: " + objetoT.getClass().getName()); //muestra el nombre la clase que va implementar esta clase
        System.out.println("K es un: " + objetoK.getClass().getName());
        System.out.println("E es un: " + objetoE.getClass().getName());
        System.out.println("V es un: " + objetoV.getClass().getName());
    }
}
