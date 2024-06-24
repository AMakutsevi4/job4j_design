package ru.job4j.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Я учусь на Job4j");

        String textOne = "Я учусь на Job4j";
        Matcher matcherOne = pattern.matcher(textOne);
        boolean isPresentOne = matcherOne.matches();
        System.out.println(isPresentOne);

        String textTwo = "Я учусь на курсе Job4j";
        Matcher matcherTwo = pattern.matcher(textTwo);
        boolean isPresentTwo = matcherTwo.matches();
        System.out.println(isPresentTwo);

        Pattern pattern1 = Pattern.compile("Job4j", Pattern.CASE_INSENSITIVE);

        String textOne1 = "Job4j";
        Matcher matcherOne1 = pattern1.matcher(textOne1);
        boolean isPresentOne1 = matcherOne1.matches();
        System.out.println(isPresentOne1);

        String textTwo2 = "job4j";
        Matcher matcherTwo2 = pattern1.matcher(textTwo2);
        boolean isPresentTwo2 = matcherTwo2.matches();
        System.out.println(isPresentTwo2);

        Pattern pattern3 = Pattern.compile("Job4j");
        String text3 = "Job4j и Job4j и Job4j";
        Matcher matcher3 = pattern3.matcher(text3);
        while (matcher3.find()) {
            System.out.println("Найдено совпадение");
            System.out.println("Найдено совпадение " + matcher3.group());
            System.out.println("Найдено совпадение. iStart: " + matcher3.start()
                    + " iEnd: " + matcher3.end());
        }

        Pattern pattern4 = Pattern.compile("123");
        String text4 = "1231 и 1232 и 1233";
        Matcher matcher4 = pattern4.matcher(text4);
        String result = matcher4.replaceAll("Job4j");
        System.out.println(result);
    }
}