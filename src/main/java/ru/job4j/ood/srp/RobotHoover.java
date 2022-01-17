package ru.job4j.ood.srp;

/**
 * Неправильный SRP.
 * Класс робота пылесоса Не должен отправлять время предварительной уборки, нарушает принцип единственной ответственности.
 */
public class RobotHoover implements Hoover{
    @Override
    public void dryCleaning() {

    }

    @Override
    public void wetCleaning() {

    }

    @Override
    public void getTimeCleaning() {

    }
}
