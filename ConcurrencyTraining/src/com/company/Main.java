package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {

    public static void main(String[] args) {
        Thread th = new Thread(new Main());
        Thread th2 = new Thread(new Main());
        th.start();
    th2.start();
       // ExecutorService executorService = Executors.newFixedThreadPool(2);
      //  executorService.submit(th);
      //  executorService.submit(th2);


    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println("lol"+i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) { return;
        }
    }
}
