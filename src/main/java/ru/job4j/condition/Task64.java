package ru.job4j.condition;

public class Task64 {
    public static void gradePrint(int number) {
        String string;
        switch (number) {
            case 1, 2 -> string = "Плохо";
            case 3 -> string = "Удовлетворительно";
            case 4 -> string = "Хорошо";
            case 5 -> string = "Отлично";
            default -> string = "Не соответствует";
        }
        System.out.println(string);
    }
}
