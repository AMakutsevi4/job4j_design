package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        String string;
        switch (number) {
            case 23, 0, 1, 2, 3, 4, 5 -> string = "Ночь";
            case 6, 7, 8, 9, 10 -> string = "Утро";
            case 11, 12, 13, 14, 15, 16, 17 -> string = "День";
            case 18, 19, 20, 21, 22 -> string = "Вечер";
            default -> string = "Не является часом";
        }
        System.out.println(string);

    }
}
