package ru.job4j.gc;

public class UserDemo {
    private static final long KB = 1000;
    private static final long MB = KB * KB;
    private static final Runtime ENVIRONMENT = Runtime.getRuntime();

    public static void info() {
        final long freeMemory = ENVIRONMENT.freeMemory();
        final long totalMemory = ENVIRONMENT.totalMemory();
        final long maxMemory = ENVIRONMENT.maxMemory();
        System.out.println("=== Environment state ===");
        System.out.printf("Free: %d%n", freeMemory / MB); /** показывает количество свободной памяти в байтах*/
        System.out.printf("Total: %d%n", totalMemory / MB); /** показывает общее количество памяти которое может быть использовано */
        System.out.printf("Max: %d%n", maxMemory / MB); /** показывает максимальное кол-во памяти которое может быть использовано */
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6000; i++) {
            new User(i, "N " + i);
        }
        System.gc(); /** рекомендация для вызова сборки мусора */
        info();
    }
}
