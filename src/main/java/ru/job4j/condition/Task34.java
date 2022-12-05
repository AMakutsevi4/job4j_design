package ru.job4j.condition;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils == chairs) {
            System.out.println("Соответствует");
        }
        if (pupils != chairs) {
            System.out.println(pupils > chairs ? "Не хватает стульев: "
                    + (pupils - chairs) : "Лишних стульев: " + (chairs - pupils));
        }
    }
}
