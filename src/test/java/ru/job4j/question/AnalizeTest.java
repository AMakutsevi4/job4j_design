package ru.job4j.question;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnalizeTest {

    @Test
    public void whenNotChanged() {
        Analize.User u1 = new Analize.User(1, "A");
        Analize.User u2 = new Analize.User(2, "B");
        Analize.User u3 = new Analize.User(3, "C");
        Set<Analize.User> previous = Set.of(u1, u2, u3);
        Set<Analize.User> current = Set.of(u1, u2, u3);
        assertThat(
                Analize.diff(previous, current),
                is(new Analize.Info(0, 0, 0))
        );
    }

    @Test
    public void whenOneChanged() {
        Analize.User u1 = new Analize.User(1, "A");
        Analize.User u2 = new Analize.User(2, "B");
        Analize.User u3 = new Analize.User(3, "C");
        Set<Analize.User> previous = Set.of(u1, u2, u3);
        Set<Analize.User> current = Set.of(u1, new Analize.User(2, "BB"), u3);
        assertThat(
                Analize.diff(previous, current),
                is(new Analize.Info(0, 1, 0))
        );
    }

    @Test
    public void whenOneDeleted() {
        Analize.User u1 = new Analize.User(1, "A");
        Analize.User u2 = new Analize.User(2, "B");
        Analize.User u3 = new Analize.User(3, "C");
        Set<Analize.User> previous = Set.of(u1, u2, u3);
        Set<Analize.User> current = Set.of(u1, u3);
        assertThat(
                Analize.diff(previous, current),
                is(new Analize.Info(0, 0, 1))
        );
    }

    @Test
    public void whenOneAdded() {
        Analize.User u1 = new Analize.User(1, "A");
        Analize.User u2 = new Analize.User(2, "B");
        Analize.User u3 = new Analize.User(3, "C");
        Set<Analize.User> previous = Set.of(u1, u2, u3);
        Set<Analize.User> current = Set.of(u1, u2, u3, new Analize.User(4, "D"));
        assertThat(
                Analize.diff(previous, current),
                is(new Analize.Info(1, 0, 0))
        );
    }

    @Test
    public void whenAllChanged() {
        Analize.User u1 = new Analize.User(1, "A");
        Analize.User u2 = new Analize.User(2, "B");
        Analize.User u3 = new Analize.User(3, "C");
        Set<Analize.User> previous = Set.of(u1, u2, u3);
        Set<Analize.User> current = Set.of(new Analize.User(1, "AA"), u2, new Analize.User(4, "D"));
        assertThat(
                Analize.diff(previous, current),
                is(new Analize.Info(1, 1, 1))
        );
    }

}