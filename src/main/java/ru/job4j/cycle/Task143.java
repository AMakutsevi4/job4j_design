package ru.job4j.cycle;

public class Task143 {
    public static void loop(int num1, int num2) {
        int rsl = 0;
        int index = 1;
        while (index != 10) {
            if (num1 % index == 0 && num2 % index == 0) {
                rsl = index;
            }
            index++;
        }
        System.out.println(rsl);
    }
}