package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("Все равны");
        } else if (a == b && c > a) {
            System.out.println("Первое и второе равны, третье больше");
        } else if (a == c && b > a) {
            System.out.println("Первое и третье равны, второе больше");
        } else if (b == c && a > b) {
            System.out.println("Второе и третье равны, первое больше");
        } else if (a == b && b > c) {
            System.out.println("Первое и второе равны, третье меньше");
        } else if (a == c && a > b) {
            System.out.println("Первое и третье равны, второе меньше");
        } else if (b == c && b > a) {
            System.out.println("Второе и третье равны, первое меньше");
        } else {
            System.out.println("Равных нет");
        }
    }
}
