package ru.job4j.array;

import java.util.Scanner;
import java.util.StringJoiner;

public class BubbleSort {
    public static void main(String[] args) {


//        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
//        bubbleSort(array);
//        System.out.println(arrayToString(array));


        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Имя студента");
            Student student = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
            System.out.println("Введите имя и фамилию студента");
            Student student1 = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());

          //     scanner.nextLine();

            System.out.println(student);
            System.out.println(student1);

    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

}
