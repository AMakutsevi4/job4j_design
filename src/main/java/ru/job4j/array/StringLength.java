package ru.job4j.array;

public class StringLength {

    public static void main(String[] args) {
        String string = "      Привет, как тебя зовут ?     ";
        String[] array = string.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("Количество слов " + array.length);
    }
}
