package ru.job4j.design.srp;

import org.junit.Ignore;
import org.junit.Test;

import javax.xml.bind.JAXBException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReportXmlEngineTest {

    @Ignore
    @Test
    public void whenXMLThenGenerated() throws JAXBException {
        MemStore store = new MemStore();
        Employee worker = new Employee("Ivan", null, null, 100);
        store.add(worker);
        Report xml = new ReportXmlEngine(store);
        String rsl = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<filter>Name;"
                + " Hired; Fired; Salary;\r\nIvan;null;null;7500.0;\r\n</filter>";
        assertThat(xml.generate((e -> true)), is(rsl));
    }
}
