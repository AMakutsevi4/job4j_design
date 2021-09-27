package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class Analizy {
    public static void unavailable(String source, String target) {
        try (BufferedReader in = new BufferedReader(new FileReader(source));
             PrintWriter out = new PrintWriter(new FileOutputStream(target))) {
            StringBuilder builder = new StringBuilder();
            String s = in.readLine();
            while (s != null) {
                String[] split = s.split(" ");
                if (builder.length() == 0 && split[0].contains("400") || split[0].contains("500")) {
                    builder.append(split[1]).append(";");
                }
                if (builder.length() != 0 && split[0].contains("200") || split[0].contains("300")) {
                    builder.append(split[1]).append(";").append(System.lineSeparator());

                }
                s = in.readLine();
            }
            out.append(builder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unavailable("source.log", "target.log");
        try (PrintWriter out = new PrintWriter(new FileOutputStream("unavailable.csv"))) {
            out.println("15:01:30;15:02:32");
            out.println("15:10:30;23:12:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
