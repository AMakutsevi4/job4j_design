package ru.job4j.io;

import java.io.FileOutputStream;

public class ResultFile {

    public static String multiplayer(int size) {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rsl.append((i + 1) * (j + 1));
                if (j + 1 == size) {
                    rsl.append(System.lineSeparator());
                } else {
                    rsl.append("  ");
                }
            }

        }
        return rsl.toString();
    }

    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            out.write(multiplayer(9).getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("multiplication table is printed".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}