package ru.job4j.thread;

import java.util.concurrent.Semaphore;

public class Task7 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        CheckSemaphore s1 = new CheckSemaphore();
        s1.semaphore = semaphore;
        CheckSemaphore s2 = new CheckSemaphore();
        s2.semaphore = semaphore;
        CheckSemaphore s3 = new CheckSemaphore();
        s3.semaphore = semaphore;
        CheckSemaphore s4 = new CheckSemaphore();
        s4.semaphore = semaphore;
        CheckSemaphore s5 = new CheckSemaphore();
        s5.semaphore = semaphore;

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        Thread t4 = new Thread(s4);
        Thread t5 = new Thread(s5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    static class CheckSemaphore extends Thread {
        Semaphore semaphore;
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            semaphore.release();
        }
    }
}
