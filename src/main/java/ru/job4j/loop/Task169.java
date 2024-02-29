package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (j >= i && j <= columnCount - i - 1
                        || j <= i && j >= columnCount - i - 1) {
                    System.out.print(star);
                } else if (i > j) {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}