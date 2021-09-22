package ru.job4j.io;

import java.io.FileOutputStream;

public class ResultFile {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (byte i = 0; i < 10; i++) {
                for (byte j = 0; j < 10; j++) {
                    out.write((((i + 1) * (j + 1)) + System.lineSeparator()).getBytes());
                }
            }
            out.write(System.lineSeparator().getBytes());
            out.write("multiplication table is printed".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}