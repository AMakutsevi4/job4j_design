package ru.job4j.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("11");
        String text = "111111";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Найдено совпадение: " + matcher.group());
        }

        String string = "123+=-456:/789";
        String[] result = string.split("\\D+");
        System.out.println(Arrays.toString(result));

        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b");
        String text1 = "24.04.1987 11.11.111111 99.99.99991 99.99.9999 99999999 0000.00.00";
        Matcher matcher1 = pattern1.matcher(text1);
        while (matcher1.find()) {
            System.out.println("Найдено совпадение: " + matcher1.group());
        }

        Pattern pattern2 = Pattern.compile("\\S{1,}@\\S{1,}\\.\\S{1,}");
        String text2 = "peter-2022@example.com example65@mail_box.ru 123_45@example-mailbox.com";
        Matcher matcher2 = pattern2.matcher(text2);
        while (matcher2.find()) {
            System.out.println("Найдено совпадение: " + matcher2.group());
        }
    }
}
