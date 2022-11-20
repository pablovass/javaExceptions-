package com.pablovass.thread_runnable;

public class HiloApp {
    public static void main(String[] args) throws InterruptedException {
        THilo hilo1 = new THilo(1);
        hilo1.start();

        Thread hilo2 = new Thread(new RHilo(2));
        Thread.sleep(3000); // aca no sale en amarillo
        //hilo2.sleep(3000); // sale en amarillo porque me estoy sosteniendo desde el objeto tengo que hacerlo desde la clase
        hilo2.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("[a] hilo ejecutandose");
            }
        };
        Thread hilo3 = new Thread(r);
        hilo3.join(); // se prosesa con prioridad
        System.out.println("ejecutandose el hilo main");
    }
}
