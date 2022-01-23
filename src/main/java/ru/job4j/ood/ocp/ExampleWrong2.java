package ru.job4j.ood.ocp;

public class ExampleWrong2 {

    /**
     * В данном примере отсутствует гибкость условия, ведь для каждого самолета своя скорость для взлета
     */

    private int s;

    public void main() {
        if (s < 270) {
            ThePlanePicksUpSpeed();
        } else {
            PlaneTakesOff();
        }
    }

    private void PlaneTakesOff() {
    }

    private void ThePlanePicksUpSpeed() {
    }
}
