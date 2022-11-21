package com.pablovass.promesas;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(2); // le decimos cuentos hilos va a tener mi pool
        Future<String>task1=executor.submit(new CHilo());  //Future es como una promesa
        Future<?> task2= executor.submit(new Rhilo()); // y esto me va devolver un objeto de tipo future

        while (!task1.isDone()&&!task2.isDone()){

        }
        System.out.println(task1.get());
        System.out.println(task2.get());
        
    }
}
