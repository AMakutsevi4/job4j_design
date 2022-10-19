package ru.job4j.condition;

public class Task29 {
    public static void triangleCheck(double side1, double side2, double hypotenuse) {
        System.out.println(Math.pow(side1, 2)
                + Math.pow(side2, 2)
                == Math.pow(hypotenuse, 2) ? "Да" : "Нет");
    }
}
