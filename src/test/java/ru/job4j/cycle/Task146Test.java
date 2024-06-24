package ru.job4j.cycle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task146Test {
    public String ln = "\n";

    @Test
    public void when60And80And80And70And65Then4And290AndBothMany() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {60, 80, 80, 70, 65};
        Task146.loop(nums);
        String expected = "Людей: 4, вес: 290, отказ: Много людей и перегруз" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when60And80And80Then3And220AndOk() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {60, 80, 80};
        Task146.loop(nums);
        String expected = "Людей: 3, вес: 220, отказ: Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when60And80And80And80Then4And300AndOk() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {60, 80, 80, 80};
        Task146.loop(nums);
        String expected = "Людей: 4, вес: 300, отказ: Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when100And90And80And80Then3And270AndOverWeight() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {100, 90, 80, 80};
        Task146.loop(nums);
        String expected = "Людей: 3, вес: 270, отказ: Перегруз" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when60And55And60And55And65Then4And230AndManyPeople() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {60, 55, 60, 55, 65};
        Task146.loop(nums);
        String expected = "Людей: 4, вес: 230, отказ: Много людей" + ln;
        assertThat(out.toString(), is(expected));
    }
}