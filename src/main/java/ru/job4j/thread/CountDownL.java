package ru.job4j.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownL {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        countDownLatch.await();
        System.out.println("all job done");

    }
}

class Work extends Thread {
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }


    @Override
    public void run() {
        try {
            System.out.println("Hey");
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done work");
        countDownLatch.countDown();
    }
}
