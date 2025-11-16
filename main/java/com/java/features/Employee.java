package com.java.features;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private Long salary;
    private List<Project> projectList;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Long.compare(getSalary(), o.getSalary());
    }
}
