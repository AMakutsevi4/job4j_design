package ru.job4j.design.lsp.food;

import java.util.Calendar;

public class ControllQuality {

    Calendar calendar = Calendar.getInstance();

    private Warehouse warehouse = new Warehouse();
    private Shop shop = new Shop();
    private Trash trash = new Trash();


    public void distribution(Food food) {
        if (checkDate(food) < 25) {
            warehouse.add(food);
        }
        if (checkDate(food) > 25 && checkDate(food) < 75) {
            shop.add(food);
        }
        if (checkDate(food) > 75) {
            addDiscount(food);
            shop.add(food);
        } else {
            trash.add(food);
        }
    }

    public int checkDate(Food food) {

        int shelfLife = food.getExpiryDate().getDayOfYear() - food.getCreateDate().getDayOfYear();
        int deyPassed = calendar.get(Calendar.DAY_OF_MONTH) - shelfLife;
        return deyPassed / shelfLife * 100;
    }

    public int addDiscount(Food food) {

        int discount = (int) (food.getPrice() - food.getDiscount());
        return discount;
    }
}
