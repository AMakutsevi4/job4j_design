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
        String exp = "Name; Hired; Fired; Salary;\r\nIvan;null;null;7500.0;\r\n";
        assertThat(engine.generate(e -> true), is(exp));
    }
}