package org.example;


import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------------------------------------");
        Random random = new Random();
        System.out.println("INT - " + random.nextInt(10));
        System.out.println("--------------------------------------------");
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Thread t = new Thread(() -> {
//            System.out.println("Inside the thread");
//        });
//
//        t.start();
//        Future<String> f = executorService.submit(() -> "Callable Task");
//        try {
//            System.out.println("GET : " + f.get());
//        } catch (InterruptedException | ExecutionException exception) {
//            exception.printStackTrace();
//        }
        
    }
}