package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Distribution {

    private final List<Food> warehouse = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        return accept(food) && warehouse.add(food);
    }

    @Override
    public boolean accept(Food food) {
        return checkDate(food) < 25;
    }

    @Override
    public List<Food> getAllFood() {
        return warehouse;
    }
}
