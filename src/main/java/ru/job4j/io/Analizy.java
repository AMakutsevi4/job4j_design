package ru.job4j.io;

import java.io.*;

public class Analizy {
    public static void unavailable(String source, String target) {
        try (BufferedReader in = new BufferedReader(new FileReader(source))) {
            PrintWriter out = new PrintWriter(new FileOutputStream(target));
            StringBuilder builder = new StringBuilder();
            while (in.readLine() != null) {
                String[] split = in.readLine().split(" ");
                if (builder.length() == 0 && (split[0].equals("400") || split[0].equals("500"))) {
                    out.append(split[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unavailable("source.csv", "target.csv");
        try (PrintWriter out = new PrintWriter(new FileOutputStream("unavailable.csv"))) {
            out.println("15:01:30;15:02:32");
            out.println("15:10:30;23:12:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
