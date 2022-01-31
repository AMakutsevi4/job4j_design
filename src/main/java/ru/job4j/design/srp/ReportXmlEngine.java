package ru.job4j.design.srp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.function.Predicate;

public class ReportXmlEngine implements Report {

    private Store store;

    public ReportXmlEngine(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        String xml = "";
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(Employees.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Marshaller marshaller = null;
        try {
            marshaller = context.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        } catch (PropertyException e) {
            e.printStackTrace();
        }

        try (StringWriter writer = new StringWriter()) {
            try {
                marshaller.marshal(new Employees(store.findBy(filter)), writer);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            xml = writer.getBuffer().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xml;
    }
}

@XmlRootElement(name = "employees")
 class Employees {
    @XmlElement(name = "employee")
    private List<Employee> employees = null;

    public Employees() {
    }

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }
}