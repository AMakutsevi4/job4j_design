package ru.job4j.cycle;


public class Task126 {
    public static void loop(int num) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < sort(splitNumber(num)).length; i++) {
            if (i % 2 == 0) {
                even.append((sort(splitNumber(num)))[i]).append(" ");
            } else {
                odd.append((sort(splitNumber(num)))[i]).append(" ");
            }
        }
        even.deleteCharAt(even.length() - 1);
        odd.deleteCharAt(odd.length() - 1);
        System.out.println(odd);
        System.out.println(even);
    }


    private static int[] splitNumber(int num) {
        int index = 0;
        String s = Integer.toString(num);
        int[] y = new int[s.length()];
        while (num != 0) {
            y[index] = (num % 10);
            num = num / 10;
            index++;
        }
        return y;
    }

    public static int[] sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
        return massive;
    }
}
