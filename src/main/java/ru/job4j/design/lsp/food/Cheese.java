package ru.job4j.design.lsp.food;

import java.time.LocalDateTime;

public class Cheese extends Food {
    public Cheese(String name, LocalDateTime expiryDate, LocalDateTime createDate, int price, int discount) {
        super(name, expiryDate, createDate, price, discount);
    }
}
