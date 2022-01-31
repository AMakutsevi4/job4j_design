package ru.job4j.ood.lsp.postcondition;

public class Audi extends Car {

    public Audi(int price) {
        super(price);
    }

    public void discount(int cash) {
        if (price < 0) {
            throw new IllegalArgumentException("Audi не может стоить меньше 0 ");
        }
        if (cash > 20) {
            throw new IllegalArgumentException("Нельзя сделать скидку более 20% на данную марку");
        }
   }
}
