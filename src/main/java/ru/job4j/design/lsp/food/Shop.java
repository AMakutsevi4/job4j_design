package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Distribution {

    List<Food> shop = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        return shop.add(food);
    }
}
