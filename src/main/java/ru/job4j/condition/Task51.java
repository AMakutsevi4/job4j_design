package ru.job4j.condition;

public class Task51 {
    public static void fractionType(int num1, int num2) {
       if (num1 == num2) {
           System.out.println("Целое число");
       } else {
           System.out.println(num1 < num2 ? "Правильная" : "Неправильная");
       }
    }
}
