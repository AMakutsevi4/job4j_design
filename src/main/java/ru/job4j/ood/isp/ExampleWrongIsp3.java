package ru.job4j.ood.isp;

public interface ExampleWrongIsp3 {

    /**
     * Нарушение данного принципа зависит от понимания применения.
     * Метод работать интерфейса такси применим не для всех
     * реализаций и тем самым нарушает принцип ISP.
     */

    public interface Taxi {

        void rent(int money);

        void work();
    }

    class LittleCar implements Taxi {

        @Override
        public void rent(int money) {
            /**logic*/
        }

        @Override
        public void work() {
            /**logic*/
        }
    }

    class Motorcycle implements Taxi {

        @Override
        public void rent(int money) {
            /**logic*/
        }

        @Override
        public void work() {
            throw new UnsupportedOperationException();
        }
    }
}
