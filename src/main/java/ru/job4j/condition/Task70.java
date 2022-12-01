package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        int minute = 0;
        while (seconds >= 60) {
            minute++;
            seconds -= 60;
        }
        System.out.println(minute < 60 || seconds == 0 ? "Минут: " + minute + ", секунд: " + seconds : "Расчет не производится");
    }
}
