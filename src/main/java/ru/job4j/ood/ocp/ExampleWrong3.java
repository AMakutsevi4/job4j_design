package ru.job4j.ood.ocp;

public class ExampleWrong3 {

    /**
     *Также в данном примере нарушен OCP, т.к. в дальнейшем может появиться необходимость проигрывать сериалы и т.д.
     */

    private Object object;

    public void playMusic(Object o) {
    }

    public void playMovie(Object o) {
    }
}
