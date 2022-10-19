package ru.job4j.condition;

public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
        var rsl = number1 > number2 ? number1 + number2 : number1 * number2;
        if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            System.out.println(rsl);
        }
    }
}
