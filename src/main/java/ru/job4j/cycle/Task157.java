package ru.job4j.cycle;

import java.util.StringJoiner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task157 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int rsl = 0;
        for (int i = 1; i < 10_000; i++) {

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    rsl += j;
                }
            }
            if (rsl == i) {
                joiner.add(String.valueOf(i));
            }
            rsl = 0;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("interrupted");
                        break;
                    }
                }
            }
        });

        executor.shutdown();
        if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS)) {
            System.out.println("Still waiting after 100ms: calling System.exit(0)...");
            System.exit(0);
        }
        System.out.println("Exiting normally...");
    }
}