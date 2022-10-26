package ru.job4j.array;

public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        int one, two, three;
        two = 0;
        three = 0;

        one = first[0] + second[0] + third[0];
        two += first[1] + second[1] + third[1];
        three += first[2] + second[2] + third[2];

        System.out.print("Первый: " + one + ", ");
        System.out.print("второй: " + two + ", ");
        System.out.println("третий: " + three);
    }
}
