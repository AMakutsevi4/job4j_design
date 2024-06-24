package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisDefault() {
        Box box = new Box(1, 8);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Unknown object");
    }

    @Test
    void isThisNumberOfVertices() {
        Box box = new Box(4, 10);
        Integer name = box.getNumberOfVertices();
        assertThat(name).isEven()
                .isNotNegative()
                .isEqualTo(4);
    }

    @Test
    void isThisNumberOfVerticesNotEquals() {
        Box box = new Box(1, 10);
        Integer name = box.getNumberOfVertices();
        assertThat(name).isNotZero()
                .isEqualTo(-1);
    }

    @Test
    void isThisExist() {
        Box box = new Box(4, 10);
        Boolean name = box.isExist();
        assertThat(name).isTrue();
    }

    @Test
    void isThisNotExist() {
        Box box = new Box(5, 10);
        Boolean name = box.isExist();
        assertThat(name).isFalse();
    }

    @Test
    void isThisGetArea() {
        Box box = new Box(4, 2);
        Double name = box.getArea();
        assertThat(name).isEqualTo(6.9d, withPrecision(0.06d))
                .isLessThan(7.0d);
    }
}