package ru.job4j.design.lsp.food;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ControllQualityTest {

    @Test
    public void whenControllQualuty() {
        Food cheese = new Cheese("Российский", LocalDateTime.now(), LocalDateTime.now().plusDays(150), 550, 20);
        Food meat = new Meat("Говядина", LocalDateTime.now(), LocalDateTime.now().plusDays(90), 640, 30);
        Food milk = new Milk("Простоквашино 2,5 %", LocalDateTime.now(), LocalDateTime.now().plusDays(30), 94, 50);
        ControllQuality control = new ControllQuality(new ArrayList<>());
        control.distribution(cheese);
        control.distribution(meat);
        control.distribution(milk);
    }

    @Test
    public void whenControlTrashThenFalse() {
        Food cheese = new Cheese("Российский", LocalDateTime.now(), LocalDateTime.now().plusDays(150), 550, 20);
        assertFalse(new Trash().add(cheese));
    }

    @Ignore
    @Test
    public void whenControlTrashThenTrue() {
        Food cheese = new Cheese("Российский", LocalDateTime.now(), LocalDateTime.now().minusDays(150), 550, 20);
        assertTrue(new Trash().add(cheese));
    }
}