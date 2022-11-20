package com.pablovass.promesas;

import java.util.concurrent.Callable;
//la diferencia entre Runnable y Callable que que Callable retorma valor y el otro no retorna valor
public class CHilo  implements Callable<String> {
    // este retorna valor
    @Override
    public String call() throws Exception {
        return "hilo Callable";
    }

}
