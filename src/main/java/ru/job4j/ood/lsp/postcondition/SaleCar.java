package ru.job4j.ood.lsp.postcondition;

/**
 * Подкласс Audi меняет постусловие выходного параметра
 * тем самым нарушая принцип LSP.
  */

public class SaleCar {
    public static void main(String[] args) {

        Audi q3 = new Audi(20_000_000);
        q3.discount(15);
    }
}
