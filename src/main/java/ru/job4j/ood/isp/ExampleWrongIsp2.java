package ru.job4j.ood.isp;

public interface ExampleWrongIsp2 {

    /**
     * данный интерфейс нарушает принцип ISP тем, что содержит в себе более 3-х методов
     */

        public void go();

        public void run();

        public void jump();

        public void swim();

        public void ride();
    }
