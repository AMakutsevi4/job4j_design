package ru.job4j.thread;

/**
 * deadlock
 */
public class Task3 {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "DEF";

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("A is synchronized from Thread 1");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("B is synchronized from Thread 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("B is synchronized from Thread 2");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a) {
                    System.out.println("A is synchronized from Thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
