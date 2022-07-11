package ru.job4j.design.lsp.food;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public interface Distribution {

    boolean add(Food food);

    boolean accept(Food food);

    List<Food> getAllFood();

    void deleteAllFood();

    default int checkDate(Food food) {
        LocalDateTime currentDate = LocalDateTime.now();
        Duration shelfLife = Duration.between(food.getCreateDate(), food.getExpiryDate());
        Duration deyPassed = Duration.between(currentDate, food.getCreateDate());
        return Math.abs((int) ((int) deyPassed.toHours() / (shelfLife.toHours() * 0.01)));
    }
}