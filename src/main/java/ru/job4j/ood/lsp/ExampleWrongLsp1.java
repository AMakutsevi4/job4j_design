package ru.job4j.ood.lsp;

/**
 * Цеель принципа LSP - этот принцип направлен на обеспечение последовательности,
 * чтобы родительский класс или его дочерний класс могли использоваться одинаковым образом,
 * и были взаимозаменяемы, без каких-либо ошибок.
 */
public class ExampleWrongLsp1 {

    class Usage {
        public String loading(String data) {
            return data;
        }
    }

    class Repository extends Usage {
        public String loading(String data) {
            return null;
        }
    }
}
