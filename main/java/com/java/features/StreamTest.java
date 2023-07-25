package com.java.features;

import com.java.features.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sahana", 1000L);
        Employee employee2 = new Employee("Sahana1", 2000L);
        Employee employee3 = new Employee("Sahana2", 3000L);
        Employee employee4 = new Employee("Sahana3", 6000L);
        Employee employee5 = new Employee("Soumya", 7000L);
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<200; i++){
            nums.add(i+1);
            nums.add(i+1);
        }
        Project project = new Project(1);
        Project project2 = new Project(2);
        Project project3 = new Project(3);
        employee1.setProjectList(List.of(project2, project, project3));
        employee2.setProjectList(List.of(project2, project, project3));
        employee3.setProjectList(List.of(project2, project, project3));
        employee4.setProjectList(List.of(project2, project, project3));
        employee5.setProjectList(List.of(project2, project, project3));

        System.out.println(nums.stream().filter(integer -> integer%2==0).collect(Collectors.toList()));

        String name = "My name is Sahana";
        String reverse = Stream.of(name).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Set<Integer> items = new HashSet<>();
        System.out.println(list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet()));

        List<Employee> empList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        Set<String> names = empList.stream().filter(employee -> employee.getSalary()>5000L).map(Employee::getName).collect(Collectors.toSet());
        Set<Integer> ids = empList.stream().flatMap(employee -> employee.getProjectList().stream().map(Project::getId)).collect(Collectors.toSet());

        System.out.println(names);
        System.out.println(ids);
    }
}
