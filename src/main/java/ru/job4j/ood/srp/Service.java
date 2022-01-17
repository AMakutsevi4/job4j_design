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
    public static void GetImage(String path) {

    }

    /**
     * сохранить изображение
     */
    public static void SaveImage(Image img) {

    }

    /**
     * отправить email
     */
    public static void SendEmailMessage(String address, String subject, String text) {

    }
}
