package com;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sahana", 1000L);
        Employee employee2 = new Employee("Sahana1", 2000L);
        Employee employee3 = new Employee("Sahana2", 3000L);
        Employee employee4 = new Employee("Sahana3", 6000L);
        Employee employee5 = new Employee("Soumya", 7000L);
        List<Employee> empList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        Set<String> names = empList.stream().filter(employee -> employee.getSalary()>5000L).map(Employee::getName).collect(Collectors.toSet());
        System.out.println(names);
    }
}
