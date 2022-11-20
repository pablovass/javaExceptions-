package com.pablovass.promesas;

public class Rhilo implements Runnable {
    // este no retorna valor
    @Override
    public void run() {
        System.out.println("Hilo Runnable");
    }
}
