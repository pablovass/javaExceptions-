package com.pablovass.completionService;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(2); // le decimos cuentos hilos va a tener mi pool
        //ExecutorCompletionService hace que los hilos no se hagan de forma concurrente
        ExecutorCompletionService<String> completionService=new ExecutorCompletionService<>(executor);
        //siempre va a tomar el hilo que mas se demora

        completionService.submit(new HiloCallable(3000));  //Future es como una promesa
        completionService.submit(new HiloCallable(2000));  //Future es como una promesa


        while (true){
            System.out.println(completionService.take().get());
        }


    }
}
