package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Distribution {

    List<Food> warehouse = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        return warehouse.add(food);
    }
}
