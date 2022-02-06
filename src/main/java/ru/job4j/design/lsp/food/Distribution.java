package ru.job4j.design.lsp.food;

import java.util.Calendar;
import java.util.List;

public interface Distribution {

    boolean add(Food food);

    boolean accept(Food food);

    List<Food> getAllFood();

    default int checkDate(Food food) {
        Calendar days = Calendar.getInstance();
        int shelfLife = food.getExpiryDate().getDayOfYear() - food.getCreateDate().getDayOfYear();
        int deyPassed = days.get(Calendar.DAY_OF_MONTH) - shelfLife;
        return deyPassed / shelfLife * 100;
    }


}