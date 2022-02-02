package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Distribution {

    private final List<Food> shop = new ArrayList<>();

    @Override
    public boolean add(Food food) {

        return accept(food) && shop.add(food);
    }

    @Override
    public boolean accept(Food food) {
        if (checkDate(food) > 75) {
            food.setPrice((int) (food.getPrice() - food.getDiscount()));
        }
        return checkDate(food) > 25 && checkDate(food) < 75;
    }
}
