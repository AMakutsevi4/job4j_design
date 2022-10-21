package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTwoTest {
    @Test
    public void lettersLowerCaseWithDigits() {
        char[] input = "alpha012".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCaseTwo.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseWithDigitsWithSymbols() {
        char[] input = "alpha-12@?-".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCaseTwo.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseAndOneUpperCaseDigitsSymbolsSpace() {
        char[] input = "aLpha - 1-0!@#$5".toCharArray();
        char[] expect = "APHA".toCharArray();
        assertArrayEquals(expect, UpperCaseTwo.onlyLowCase(input));
    }

    @Test
    public void lettersLowerCaseAndTwoUpperCaseDigitsSpace() {
        char[] input = "aLpHa - 1".toCharArray();
        char[] expect = "APA".toCharArray();
        assertArrayEquals(expect, UpperCaseTwo.onlyLowCase(input));
    }
}