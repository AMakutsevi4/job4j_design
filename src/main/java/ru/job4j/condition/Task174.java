package ru.job4j.condition;

public class Task174 {

    public static void isPalindrome(int number) {
        String flag = "Да";
        String q = String.valueOf(number);
        for (int i = 0; i < q.length() / 2; i++) {
            if (q.charAt(i) != q.charAt(q.length() - i - 1)) {
                flag = "Нет";
                break;
            }
        }
        System.out.println(flag);
    }
}
