package com.java.features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sahana", 1000L);
        Employee employee2 = new Employee("Sahana1", 2000L);
        Employee employee3 = new Employee("Sahana2", 8000L);
        Employee employee4 = new Employee("Sahana3", 6000L);
        Employee employee5 = new Employee("Soumya", 7000L);
        List<Employee> employeeList = List.of(employee1, employee2
        ,employee3, employee4, employee5);
        System.out.println(employeeList.stream().max(Comparator.naturalOrder())
                        .filter(employee -> employee.getName().equals("None"))
                .map(Employee::getName));
    }
}
