package ru.job4j.ood.dip;

public class ExampleWrongDip1 {

    /**
     * Метод createCar() нарушает принцип DIP тем,
     * что принимает на вход реализацию, вместо абстракции.
     */

    public interface Car {
        void createCar(Audi a5);
    }

    interface Engine {
        void power();
    }

    class Audi implements Engine {

        @Override
        public void power() {
            /**logic*/
        }
    }
}
