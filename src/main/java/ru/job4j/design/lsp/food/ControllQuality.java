package ru.job4j.design.lsp.food;

import java.util.List;

public class ControllQuality {

    private final List<Distribution> distributionList;

    public ControllQuality(List<Distribution> distributionList) {
        this.distributionList = distributionList;
        Warehouse warehouse = new Warehouse();
        Shop shop = new Shop();
        Trash trash = new Trash();
        distributionList.add(warehouse);
        distributionList.add(shop);
        distributionList.add(trash);
    }

    public void distribution(Food food) {
        for (Distribution distribution : distributionList) {
            distribution.add(food);
        }
    }

}
