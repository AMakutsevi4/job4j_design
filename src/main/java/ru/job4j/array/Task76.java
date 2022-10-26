package ru.job4j.array;

public class Task76 {
    public static void array(int[] arr) {
        int five = 0;
        int foo = 0;
        int three = 0;
        int two = 0;
        int one = 0;

        for (int q : arr) {
            if (q == 5) {
                five++;
            } else if (q == 4) {
                foo++;
            } else if (q == 3) {
                three++;
            } else if (q == 2) {
                two++;
            } else {
                one++;
            }
        }
        System.out.print("5: " + five + ", ");
        System.out.print("4: " + foo + ", ");
        System.out.print("3: " + three + ", ");
        System.out.print("2: " + two + ", ");
        System.out.println("1: " + one);
    }
}