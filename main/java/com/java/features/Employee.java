package com.java.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("sahana", 123.00);
        Employee emp2 = new Employee("soumya", 1567.00);
        List<Employee> employees = Arrays.asList(emp1, emp2);
        System.out.println(employees.stream().sorted((x, y) -> (int)(y.salary - x.salary))
                .collect(Collectors.toList()));
    }
}
