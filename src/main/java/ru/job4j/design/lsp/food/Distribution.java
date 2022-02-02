package ru.job4j.design.lsp.food;

import java.util.Calendar;

public interface Distribution {

     boolean add(Food food);

     boolean accept(Food food);

     default int checkDate(Food food) {
        Calendar days = Calendar.getInstance();
        int shelfLife = food.getExpiryDate().getDayOfYear() - food.getCreateDate().getDayOfYear();
        int deyPassed = days.get(Calendar.DAY_OF_MONTH) - shelfLife;
        return deyPassed / shelfLife * 100;
    }
}