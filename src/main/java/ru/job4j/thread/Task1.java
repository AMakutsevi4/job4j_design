package ru.job4j.thread;

public class Task1 {

    /** 5 status of Thread = new, ready, running, blocked, dead */
    /** sleep yieId join*/
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World! " + Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();


        myThread.join();

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();

        Thread t2 = new Thread(myThreadRunnable);
        t2.start();

        System.out.println("Main thread is dead");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());

        }
    }
}

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

