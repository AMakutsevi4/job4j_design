package ru.job4j.generics;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoleStoreTest {
    @Test
    public void whenReplaceRole() {
        RoleStore roleStore = new RoleStore();
        Role one = new Role("brain");
        Role two = new Role("empty");
        Role three = new Role("my");
        roleStore.add(one);
        roleStore.add(two);
        roleStore.replace("brain", three);
        assertThat(roleStore.findById("brain"), is(three));
    }

}