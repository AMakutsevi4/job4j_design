package ru.job4j.cycle;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int i : months) {
            if (i == 1 || i == 2 || i == 12) {
                winter++;
            }
            if (i > 2 && i < 6) {
                spring++;
            }
            if (i >= 6 && i < 9) {
                summer++;
            }
            if (i >= 9 && i < 12) {
                fall++;
            }
        }
        String expected = "Зимой: " + winter + ", Весной: " + spring + ", Летом: " + summer + ", Осенью: " + fall;
        System.out.println(expected);
    }
}
