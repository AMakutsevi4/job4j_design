package ru.job4j.ood.lsp.postcondition;

public class Car {

    protected int price;

    public Car(int price) {
        this.price = price;
    }

    public void discount(int cash) {
        if (cash < 0) {
            throw new IllegalArgumentException("Скидка не может быть меньше 0 ");
        }
        if (cash > 50) {
            throw new IllegalArgumentException("Скидка не может быть больше 50 % ");
        }
     }
}
