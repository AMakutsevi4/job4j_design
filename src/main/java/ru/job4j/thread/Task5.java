package ru.job4j.thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task5 {
    static Account account = new Account();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyDeposit());
        Thread t2 = new Thread(new MyWithdraw());
        t1.start();
        t2.start();
    }

    static class Account {
        //    Lock lock = new ReentrantLock();
        //    Condition newCondition = lock.newCondition();
        int balance = 0;

        public synchronized void deposit(int amount) throws InterruptedException {
            //       lock.lock();
            Thread.sleep(1_000);
            balance += amount;
            System.out.println("Balance is increased " + balance);
            notifyAll();
            //         newCondition.signalAll();
            //        lock.unlock();
        }

        public synchronized void withdraw(int amount) throws InterruptedException {
            //       lock.lock();
            while (amount > balance) {
                //           newCondition.await();
                wait();
            }
            System.out.println("Balance before withdrawal " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal " + balance);
            //       lock.unlock();
        }
    }

    static class MyDeposit extends Thread {
        @Override
        public void run() {

            try {
                account.deposit(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyWithdraw extends Thread {
        @Override
        public void run() {

            try {
                account.withdraw(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}