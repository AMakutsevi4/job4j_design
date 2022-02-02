package ru.job4j.design.lsp.food;

import java.time.LocalDateTime;

public class Milk extends Food {
    public Milk(String name, LocalDateTime expiryDate, LocalDateTime createDate, int price, int discount) {
        super(name, expiryDate, createDate, price, discount);
    }
}
