package ru.job4j.design.srp;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReportXmlEngineTest {

    @Ignore
    @Test
    public void whenXMLThenGenerated() {
        MemStore store = new MemStore();
        Employee worker = new Employee("Ivan", null, null, 100);
        store.add(worker);
        Report xml = new ReportXmlEngine(store);
        String rsl = "<?xml version=\"1.0\" encoding=\"UTF-8\" s"
                + "tandalone=\"yes\"?>\n<employees>\n    <employee>\n"
                + "        <name>Ivan</name>\n        <salary>100.0</salary>\n"
                + "    </employee>\n</employees>\n";
        assertThat(xml.generate((e -> true)), is(rsl));
    }
}
