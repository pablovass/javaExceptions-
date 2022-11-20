package com.pablovass.thread_runnable.sleep_join;
// si usas thread usaamos herencia
public class THilo extends Thread {
    private int id;

    public THilo(int id) {
        this.id = id;
    }

    //para poder implementar la logica de una hilo tengo que sobrescribir el metodo run
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("ejecutando logica de hilo de id" + id);
        }
    }
}
