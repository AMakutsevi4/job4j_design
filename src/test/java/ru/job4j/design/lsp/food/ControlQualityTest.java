package ru.job4j.design.lsp.food;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ControlQualityTest {

    @Test
    public void whenControlQuality() {
        Food cheese = new Cheese("Российский", LocalDateTime.now(), LocalDateTime.now().plusDays(150), 550, 20);
        Food meat = new Meat("Говядина", LocalDateTime.now(), LocalDateTime.now().plusDays(90), 640, 30);
        Food milk = new Milk("Простоквашино 2,5 %", LocalDateTime.now(), LocalDateTime.now().plusDays(30), 94, 50);
        ControlQuality control = new ControlQuality(new ArrayList<>());
        control.distribution(cheese);
        control.distribution(meat);
        control.distribution(milk);
    }

    @Test
    public void whenControl() {
        List<Distribution> list = new ArrayList<>();
        Food cheese = new Cheese("Российский", LocalDateTime.now(), LocalDateTime.now().plusDays(2), 550, 20);
        Food meat = new Meat("Говядина", LocalDateTime.now(), LocalDateTime.now().minusDays(90), 640, 30);
        Food milk = new Milk("Простоквашино 2,5 %", LocalDateTime.now(), LocalDateTime.now().plusDays(30), 94, 50);
        list.add(new Trash());
        list.add(new Shop());
        list.add(new Warehouse());
        ControlQuality control = new ControlQuality(list);
        control.distribution(cheese);
        control.distribution(meat);
        control.distribution(milk);
        assertEquals(0, new Warehouse().getAllFood().size());
        assertEquals(0, new Shop().getAllFood().size());
        assertEquals(0, new Trash().getAllFood().size());
    }

    @Test
    public void whenAddThenWarehouse() {
        Food food = new Milk("Простоквашино 2,5 %", LocalDateTime.now(), LocalDateTime.now().plusDays(30), 94, 50);
        Food meat = new Meat("Говядина", LocalDateTime.now(), LocalDateTime.now().plusDays(90), 640, 30);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(food);
        controlQuality.distribution(meat);
        assertEquals(2, warehouse.getAllFood().size());
    }

    @Test
    public void whenAddThenTrash() {
        Food milk = new Milk("Простоквашино 2,5 %", LocalDateTime.now().plusDays(1), LocalDateTime.now(), 94, 50);
        Food meat = new Meat("Говядина", LocalDateTime.now().plusDays(1), LocalDateTime.now(), 640, 30);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(meat);
        controlQuality.distribution(milk);
        assertEquals(2, trash.getAllFood().size());
    }

    @Ignore
    @Test
    public void whenAddThenShop() {
        Food food = new Milk("Простоквашино 2,5 %", LocalDateTime.now(), LocalDateTime.now().minusDays(3), 94, 50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(food);
        assertEquals(1, shop.getAllFood().size());
    }

    @Ignore
    @Test
    public void whenDiscount() {
        Food food = new Milk("Простоквашино 2,5 %", LocalDateTime.now().plusDays(3), LocalDateTime.now(), 94, 20);
        food.setDiscount(50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(food);
        assertEquals(20, shop.getAllFood().get(0).getDiscount());
    }
}