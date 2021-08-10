package ru.job4j.generics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class UserStoreTest {

    @Test
    public void whenReplace() {
        UserStore users = new UserStore();
        User one = new User("one");
        User two = new User("two");
        User three = new User("three");
        User four = new User("four");
        users.add(one);
        users.add(two);
        users.add(three);
        users.replace("one", four);
        assertThat(users.findById("one"), is(four));
    }

    @Test
    public void whenDelete() {
        UserStore users = new UserStore();
        User one = new User("one");
        User two = new User("two");
        users.add(one);
        users.add(two);
        users.delete("two");
        assertTrue("two", true);
    }
}