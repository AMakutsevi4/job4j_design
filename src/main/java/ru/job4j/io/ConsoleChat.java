package ru.job4j.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConsoleChat {
    private final String path;
    private final String botAnswers;
    private static final String OUT = "закончить";
    private static final String STOP = "стоп";
    private static final String CONTINUE = "продолжить";
    private static final List<String> ANSWERS = new ArrayList<>();
    private static final List<String> LOG = new ArrayList<>();


    public ConsoleChat(String path, String botAnswers) {
        this.path = path;
        this.botAnswers = botAnswers;
    }

    public void run() throws IOException {
        String speak;
        String botSay;
        boolean flag = true;
        do {
            readPhrases();
            System.out.print("Вы - ");
            speak = consoleInput();
            LOG.add("Вы: " + speak);
            flag = !speak.toLowerCase(Locale.ROOT).equals(STOP) && flag;
            flag = speak.toLowerCase(Locale.ROOT).equals(CONTINUE) || flag;
            if (flag) {
                botSay = "Бот: " + ANSWERS.get((int) (Math.random() * ANSWERS.size()));
                System.out.println(botSay);
                LOG.add(botSay);

            }
        } while (!speak.toLowerCase(Locale.ROOT).equals(OUT));
        saveLog();
    }

    private String consoleInput() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void readPhrases() {
        try (BufferedReader br = new BufferedReader(new FileReader(botAnswers, Charset.forName("WINDOWS-1251")))) {
            br.lines().forEach(ANSWERS::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveLog() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path, Charset.forName("WINDOWS-1251"), true))) {
            ConsoleChat.LOG.forEach(pw::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void validate(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Root folder is null. Usage java -jar dir.jar ROOT_FOLDER.");
        }
    }

    public static void main(String[] args) throws IOException {
        validate(args);
        ConsoleChat cc = new ConsoleChat(args[1], args[0]);
        cc.run();
    }
}