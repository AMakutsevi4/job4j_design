package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class Trash implements Distribution {

    List<Food> trash = new ArrayList<>();

    @Override
    public boolean add(Food food) {
        return trash.add(food);
    }
}
