package ru.job4j.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread pool
 */
public class Task6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new MyThread8("A"));
            executorService.execute(new MyThread8("B"));
            executorService.execute(new MyThread8("C"));
            executorService.execute(new MyThread8("D"));
            executorService.execute(new MyThread8("E"));

        }
        executorService.shutdown();
    }
}

class MyThread8 extends Thread {
    String name;

    public MyThread8(String name) {
        this.name = name;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
        }
    }
}
