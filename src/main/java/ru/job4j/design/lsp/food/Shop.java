package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Distribution {

    private final List<Food> shop = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        if (checkDate(food) > 75 && checkDate(food) < 100) {
            food.setPrice((food.getPrice() - food.getDiscount()));
        }
        return accept(food) && shop.add(food);
    }

    @Override
    public boolean accept(Food food) {
        return checkDate(food) >= 25 && checkDate(food) <= 75 || checkDate(food) > 75 && checkDate(food) < 100;
    }

    @Override
    public List<Food> getAllFood() {
        return new ArrayList<>(shop);
    }

    @Override
    public void deleteAllFood() {
        shop.clear();
    }
}
