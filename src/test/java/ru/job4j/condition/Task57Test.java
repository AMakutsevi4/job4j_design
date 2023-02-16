package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task57Test {
    public String ln = System.lineSeparator();

    @Test
    public void when90And45ThenRightAndIsosceles() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(90, 45);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Прямоугольный").add("Равнобедренный");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when45And45ThenRightAndIsosceles() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(45, 45);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Прямоугольный").add("Равнобедренный");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when90And15ThenRight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(90, 15);
        String expected = "Прямоугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when75And15ThenRight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(75, 15);
        String expected = "Прямоугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when25And35ThenObtuse() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(25, 35);
        String expected = "Тупоугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when125And25ThenObtuse() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(125, 25);
        String expected = "Тупоугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when65And75ThenAcute() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(65, 75);
        String expected = "Остроугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when70And60ThenAcute() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(70, 60);
        String expected = "Остроугольный" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when60And60ThenIsoscelesAndEquilateral() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(60, 60);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Остроугольный").add("Равнобедренный").add("Равносторонний");
        assertThat(out.toString(), is(expected.toString()));
    }

    @Test
    public void when80And50ThenEquilateral() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(80, 50);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Остроугольный").add("Равнобедренный");
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when50And50ThenEquilateral() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(50, 50);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Остроугольный").add("Равнобедренный");
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when125And80ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task57.triangleType(125, 80);
        String expected = "Ошибка" + ln;
        assertThat(out.toString(), is(expected));
    }

}