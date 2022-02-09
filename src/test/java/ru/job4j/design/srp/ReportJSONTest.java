package ru.job4j.design.srp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReportJSONTest {

    @Test
    public void whenSupportJsonThenBooker() {
        MemStore store = new MemStore();
        Employee worker = new Employee("Ivan", null, null, 100);
        store.add(worker);
        Report engine = new ReportBooker(store);
        String exp = "Name; Hired; Fired; Salary;" + System.lineSeparator() + "Ivan;null;null;7500.0;" + System.lineSeparator();
        assertThat(engine.generate(e -> true), is(exp));
    }
}