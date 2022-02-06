package ru.job4j.ood.dip;

public class ExampleWrongDip3 {

    /**
     * В данном примере объекты Button управляют объектами Lamp.
     * Это решение нарушает принцип DIP тем, что класс Button зависит от класса Lamp.
     * Решение - использовать интерфейс.
     */

    public class Button {
        private Lamp lamp;

        public void poll() {
            /**logic*/
            lamp.turnOn();

        }
    }

    public class Lamp {

        public void turnOn() {
            /**logic*/
        }

        public void turnOff() {
            /**logic*/
        }
    }
}
