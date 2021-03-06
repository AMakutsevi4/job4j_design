package ru.job4j.tdd;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.List;

public class CinemaTest {

    @Test
    public void buy() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        date.set(2020, 10, 10, 23, 00);
        Ticket ticket = cinema.buy(account, 1, 1, date);
        assertThat(ticket, is(ticket));
    }

    @Test
    public void find() {
        Cinema cinema = new Cinema3D();
        cinema.add(new Session3D());
        List<Session> sessions = cinema.find(session -> true);
        assertThat(sessions, is(sessions));
    }

    @Test
    public void add() {
        Cinema cinema = new Cinema3D();
        cinema.add(new Session3D());
        List<Session> list = List.of(new Session3D(), new Session3D(), new Session3D());
        assertThat(list.size(), is(3));

    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenTicketThenError() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        date.set(2020, 19, 32, 25, 62);
        Ticket ticket = cinema.buy(account, 1, 1, date);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenBuyThenSold() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = Calendar.getInstance();
        date.set(2020, 10, 10, 23, 00);
        Ticket ticket = cinema.buy(account, 1, 1, date);
        Ticket ticket1 = cinema.buy(account, 1, 1, date);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void whenBuyThenNoDate() {
        Account account = new AccountCinema();
        Cinema cinema = new Cinema3D();
        Calendar date = null;
        Ticket ticket = cinema.buy(account, 1, 1, date);
    }
}