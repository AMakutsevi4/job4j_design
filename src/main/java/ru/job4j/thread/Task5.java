package ru.job4j.thread;


public class Task5 {
    static Account account = new Account();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyDeposit());
        Thread t2 = new Thread(new MyWithdraw());
        t1.start();
        t2.start();
    }

    static class Account {
        int balance = 0;

        public synchronized void deposit(int amount) throws InterruptedException {

            Thread.sleep(1_000);
            balance += amount;
            System.out.println("Balance is increased " + balance);
            notifyAll();

        }

        public synchronized void withdraw(int amount) throws InterruptedException {

            while (amount > balance) {
                wait();
            }
            System.out.println("Balance before withdrawal " + balance);
            balance -= amount;
            System.out.println("Balance after withdrawal " + balance);

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