package ru.job4j.ood.ocp;

public class ExampleWrong1 {

    /**
     * При добавлении нового приветствия необходимо изменять исходный код.
     * Чтобы сделать данный код расширяемый, нужно использовать интерфейс.
     */

    private String greetings;

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String greet() {
        if (this.greetings.equals("formal")) {
            return "Good evening, sir.";
        } else if (this.greetings.equals("casual")) {
            return "Sup bro?";
        } else if (this.greetings.equals("intimate")) {
            return "Hello Darling!";
        } else {
            return "Hello.";
        }
    }
}