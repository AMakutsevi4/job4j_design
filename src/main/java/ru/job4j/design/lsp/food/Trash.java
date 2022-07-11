package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Trash implements Distribution {

    private final List<Food> trash = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        return accept(food) && trash.add(food);
    }

    @Override
    public boolean accept(Food food) {
        return checkDate(food) >= 100;
    }

    @Override
    public List<Food> getAllFood() {
        return new ArrayList<>(trash);
    }

    @Override
    public void deleteAllFood() {
        trash.clear();
    }
}