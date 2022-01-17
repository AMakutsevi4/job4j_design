package ru.job4j.ood.srp;

/**
 * Неправильный SRP, интерфейс нарушает принцип единственной ответственности.
 * Интерфейс пылесоса, помимо выбора режима уборки,  отправляет время уборки.
 */

public interface Hoover {

    void dryCleaning();

    void wetCleaning();

    void getTimeCleaning();
}
