package ru.job4j.design.lsp.food;

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
        Food cheese = new Cheese("Российский", LocalDateTime.of(2022, 2, 27, 15, 0),
                LocalDateTime.of(2022, 12, 1, 10, 0), 550, 20);
        Food meat = new Meat("Говядина", LocalDateTime.now().plusDays(54), LocalDateTime.now().plusDays(22), 640, 30);
        Food milk = new Milk("Простоквашино 2,5 %", LocalDateTime.now().plusDays(1), LocalDateTime.now(), 94, 50);
        Shop shop = new Shop();
        Warehouse warehouse = new Warehouse();
        Trash trash = new Trash();
        list.add(shop);
        list.add(warehouse);
        list.add(trash);
        ControlQuality control = new ControlQuality(list);
        control.distribution(cheese);
        control.distribution(meat);
        control.distribution(milk);
        assertEquals(1, warehouse.getAllFood().size());
        assertEquals(1, shop.getAllFood().size());
        assertEquals(1, trash.getAllFood().size());
    }

    @Test
    public void whenAddThenWarehouse() {
        Food food = new Milk("Простоквашино 2,5 %",
                LocalDateTime.of(2022, 12, 28, 15, 0),
                LocalDateTime.of(2022, 2, 28, 10, 0),
                94, 50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(food);
        assertEquals(1, warehouse.getAllFood().size());
    }

    @Test
    public void whenAddThenTrash() {
        Food milk = new Milk("Простоквашино 2,5 %",
                LocalDateTime.of(2022, 2, 28, 15, 0),
                LocalDateTime.of(2022, 12, 1, 10, 0),
                94, 50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(milk);
        assertEquals(1, trash.getAllFood().size());
    }


    @Test
    public void whenAddThenShop() {
        Food meat = new Meat("Говядина", LocalDateTime.now().plusDays(54), LocalDateTime.now().plusDays(22), 640, 30);
        Food milk = new Milk("Простоквашино 2,5 %",
                LocalDateTime.of(2022, 4, 20, 18, 0),
                LocalDateTime.of(2022, 3, 7, 10, 0),
                94, 50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(meat);
        controlQuality.distribution(milk);
        assertEquals(2, shop.getAllFood().size());
    }


    @Test
    public void whenDiscount() {
        Food food = new Milk("Простоквашино 2,5 %",
                LocalDateTime.of(2021, 12, 28, 15, 0),
                LocalDateTime.of(2022, 12, 28, 10, 0),
                94, 50);
        Distribution warehouse = new Warehouse();
        Distribution shop = new Shop();
        Distribution trash = new Trash();
        ControlQuality controlQuality = new ControlQuality(List.of(warehouse, shop, trash));
        controlQuality.distribution(food);
        assertEquals(44, shop.getAllFood().get(0).getPrice());
    }
}