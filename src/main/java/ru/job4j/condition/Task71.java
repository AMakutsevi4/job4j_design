package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        int one = 0;
        int two = 0;
        int three = 0;
        while (money >= 100) {
            money = money - 100;
            one++;
        }
        while (money >= 50) {
            money = money - 50;
            two++;
        }
        while (money >= 10) {
            money = money - 10;
            three++;
        }
        System.out.println(money == 0 ? "100: " + one + ", 50: " + two + ", 10: " + three : "Нельзя");
    }
}
