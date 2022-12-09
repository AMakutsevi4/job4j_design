package ru.job4j.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int q = number;
        int rsl = 0;
        while (number != 0) {
            rsl += number % 10;
            number = number / 10;
        }
          System.out.println(q % 2 == 0 && rsl % 2 == 0 ? "Да" : "Нет");
    }
}
