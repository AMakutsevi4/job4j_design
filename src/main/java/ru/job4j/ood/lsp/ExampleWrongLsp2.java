package ru.job4j.ood.lsp;

public class ExampleWrongLsp2 {

    /**
     * Дочерний класс должен быть способен обрабатывать те же самые запросы и выдавать тот же самый результат,
     * что и родительский класс, или он может выдать результат, который имеет тот же самый тип.
     */

    /**
     * В данном примере родительский класс приносит кофе, для дочернего класса приемлемо приносить любой вид кофе (капучино, американо и тд)
     * но не приемлемо приносить воду.
     */

    class Coffee {
        public String cook(String taste) {
            return taste;
        }
    }

    class water extends Coffee {
        public String cook(String taste) {
            return "water";
        }
    }
}