package ru.job4j.ood.srp;

import jdk.jshell.spi.ExecutionControl;

import java.awt.*;

/**
 * нарушение принципа Single Responsibility Principle
 */
public class Service {

    /**
     * вернуть изображение
     */
    public static void getImage(String path) {

    }

    /**
     * сохранить изображение
     */
    public static void gaveImage(Image img) {

    }

    /**
     * отправить email
     */
    public static void sendEmailMessage(String address, String subject, String text) {

    }
}
