package ru.job4j.design.lsp.food;

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
}
