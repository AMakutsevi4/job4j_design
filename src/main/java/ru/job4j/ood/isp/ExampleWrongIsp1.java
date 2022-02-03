package ru.job4j.ood.isp;

public class ExampleWrongIsp1 {

    /**
     * Класс домашний телефон использует заглушки для методов отправить СМС и зарядить,
     * для данного класса эти методы избыточны чем нарушает принцип ISP.
     */

    class Iphone implements Telephone {

        @Override
        public void call() {
            /**logic*/
        }

        @Override
        public void sendSms() {
            /**logic*/
        }

        @Override
        public void charge() {
            /**logic*/
        }
    }

    class HomePhone implements Telephone {

        @Override
        public void call() {
            /**logic*/
        }

        @Override
        public void sendSms() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void charge() {
            throw new UnsupportedOperationException();
        }
    }
}
