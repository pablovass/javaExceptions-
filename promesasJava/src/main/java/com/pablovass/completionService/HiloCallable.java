package com.pablovass.completionService;

import java.util.concurrent.Callable;
public class HiloCallable implements Callable<String> {
    private int segundos;

    public HiloCallable(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(segundos);
        return "hilo Callable";
    }

}
