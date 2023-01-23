package ru.job4j.condition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        List<String> oct = new ArrayList<>();
        int rsl = 0;
        System.out.println("Оценки: " + Arrays.stream(first).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                + ", средняя: " + Arrays.stream(first).average().getAsDouble());
        if (Arrays.stream(first).average().getAsDouble() > 4.5) {
            rsl++;
            oct.add(String.valueOf(Arrays.stream(first).average().getAsDouble()));
        }
        System.out.println("Оценки: " + Arrays.stream(second).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                + ", средняя: " + Arrays.stream(second).average().getAsDouble());
        if (Arrays.stream(second).average().getAsDouble() > 4.5) {
            rsl++;
            oct.add(String.valueOf(Arrays.stream(second).average().getAsDouble()));
        }
        System.out.println("Оценки: " + Arrays.stream(third).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                + ", средняя: " + Arrays.stream(third).average().getAsDouble());
        if (Arrays.stream(third).average().getAsDouble() > 4.5) {
            rsl++;
            oct.add(String.valueOf(Arrays.stream(third).average().getAsDouble()));
        }
        System.out.printf("Выше 4.5: %d, наивысшая: %s%n", rsl, oct.stream().max(Comparator.naturalOrder()).get());
    }
}
