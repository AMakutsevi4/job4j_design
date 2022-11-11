package ru.job4j.cycle;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int maths = 0;
        int inform = 0;
        for (int i = 0; i < 5; i++) {
            if (math[i] > info[i] && math[i] > 7 && info[i] >= 7) {
                maths++;
            }
            if (info[i] >= math[i] && info[i] >= 7 && math[i] >= 5) {
                inform++;
            }
        }
        System.out.println("Зачислено: " + (maths + inform) + ", ФМ: " + maths + ", ФИ: " + inform);
    }
}
