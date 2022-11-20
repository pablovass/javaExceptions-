package com.pablovass.thread_runnable;

public class HiloApp {
    public static void main(String[] args) {
        Thread hilo1= new Thread(new RHilo(2));
        hilo1.start();
        THilo hilo2 = new THilo(1);
        //hilo.run(); // aca se ejecuta uno despues el otro
        hilo2.start();
        Runnable r =new Runnable() {
            @Override
            public void run() {
                System.out.println("[a] hilo ejecutandose");
            }
        };
        Thread hilo3=new Thread(r);
        for (int i = 0; i < 100; i++) {
            System.out.println("ejecuntando hilo main" + i);
        }
    }
}
