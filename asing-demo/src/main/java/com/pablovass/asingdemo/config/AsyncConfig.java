package com.pablovass.asingdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean("asyncExecutor")
    public Executor asyncExecutor(){
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);//minimo de hilos que se va usar en la app (cuantos core tiene tu equipo??)
        executor.setMaxPoolSize(3); // maximos de hilos que se van a crear despues del que resto estan ocupados
        executor.setQueueCapacity(4);// es la capasidad maxima total ,a la espera
        executor.setThreadNamePrefix("AsyncThread-"); // nombre de la configuracion
        executor.initialize();
        return executor;
    }
}
