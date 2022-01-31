package ru.job4j.design.srp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.StringWriter;
import java.util.function.Predicate;

public class ReportXmlEngine implements Report {

    private Store store;

    public ReportXmlEngine(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) throws JAXBException {
        StringBuilder builder = new StringBuilder();
        builder.append("Name; Hired; Fired; Salary;");
        builder.append(System.lineSeparator());
        for (Employee employee : store.findBy(filter)) {
            builder.append(employee.getName()).append(";")
                    .append(employee.getHired()).append(";")
                    .append(employee.getFired()).append(";")
                    .append(employee.getSalary()).append(";")
                    .append(System.lineSeparator());
        }

        JAXBContext context = JAXBContext.newInstance(StringBuilder.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String xml = "";
        try (StringWriter writer = new StringWriter()) {
            marshaller.marshal(new ReportXML(builder), writer);
            xml = writer.getBuffer().toString();
            System.out.println(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xml;
    }

    @XmlRootElement(name = "builder")
    public static class ReportXML {

        private StringBuilder builder;

        public ReportXML(StringBuilder builder) {
            this.builder = builder;
        }
    }
}