package ru.job4j.cycle;

public class Task125 {
    public static void loop(int num) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i : sort(splitNumber(num))) {
            if (i % 2 == 0) {
                even.append(i).append(" ");
            } else {
                odd.append(i).append(" ");
            }
        }
        if (even.length() > 1)  {
            even.deleteCharAt(even.length() - 1);
            System.out.println(even);
        }
        if (odd.length() > 1)  {
            odd.deleteCharAt(odd.length() - 1);
            System.out.println(odd);
        }
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