package ru.job4j.design.lsp.food;

import java.util.ArrayList;
import java.util.List;

public class ControlQuality {

    private final List<Distribution> distributionList;

    public ControlQuality(List<Distribution> distributionList) {
        this.distributionList = distributionList;
    }

    public void distribution(Food food) {
        for (Distribution distribution : distributionList) {
            if (distribution.accept(food)) {
                distribution.add(food);
            }
        }
    }

    public void resort() {
        List<Food> foodList = new ArrayList<>();
        for (Distribution distribution : distributionList) {
            foodList.addAll(distribution.getAllFood());
            distribution.deleteAllFood();
        }
        for (Food food : foodList) {
            distribution(food);
        }
    }
}