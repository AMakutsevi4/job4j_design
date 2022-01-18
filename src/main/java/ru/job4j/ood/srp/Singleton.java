package ru.job4j.ood.srp;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
         /**
         * описываем к примеру доступ к общему ресурсу
         * */
    }

    public static void getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
    }
}