package ru.job4j.ood.lsp;

public class ExampleWrongLsp3 {

    /**
     * В этом примере Square должен быть отдельным классом и ни в коем случае не наследоваться от Rectangle
     */

    class Rectangle {

        private int width;
        private int height;

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    class Square extends Rectangle {

        public void setSize(int size) {
            super.setWidth(size);
            super.setHeight(size);
        }
    }
}