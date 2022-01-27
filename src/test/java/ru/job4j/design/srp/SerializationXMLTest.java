package ru.job4j.design.srp;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SerializationXMLTest {

    @Test
    public void whenSupportXmlThenBooker() {
        MemStore store = new MemStore();
        Employee worker = new Employee("Ivan", null, null, 100);
        store.add(worker);
        Report engine = new ReportBooker(store);
        SerializationXML xml = new SerializationXML();
        String rsl = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<filter>Name;"
                + " Hired; Fired; Salary;\r\nIvan;null;null;7500.0;\r\n</filter>";
        assertThat(xml.generate(engine.generate(e -> true)), is(rsl));
    }
}