package ru.job4j.design.srp;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ReportBooker implements Report {

    private Store store;

    public ReportBooker(Store store) {
        this.store = store;
    }

    @Override
    public String generate(Predicate<Employee> filter) {
        StringBuilder text = new StringBuilder();
        text.append("Name; Hired; Fired; Salary;").append(System.lineSeparator());
        UnaryOperator<Double> rsl = x -> x * 75;
        for (Employee employee : store.findBy(filter)) {
            text.append(employee.getName()).append(";")
                    .append(employee.getHired()).append(";")
                    .append(employee.getFired()).append(";")
                    .append(rsl.apply(employee.getSalary())).append(";")
                    .append(System.lineSeparator());

        }
        return text.toString();
    }
}
