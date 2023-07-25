package com.java.features;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private String className;

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Student student = new Student("Sahana", "history");
        Student student1 = new Student("Sahana", "history");
        Student student2 = new Student("Soumya", "history");
        Student student3 = new Student("Aashvi", "history");
        Set<String> names = new HashSet<>();
        List<Student> students = Arrays.asList(student, student1, student2, student3);
        System.out.println(students.stream().map(student4 -> student4.name)
                .filter(name -> !names.add(name)).collect(Collectors.toSet()));

        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept("Sahana","Soumya");
        Consumer<Integer> consumer = (a) -> System.out.println(a*a);
        consumer.accept(8);

        Supplier<String> supplier = () -> "Name is Sahana";
        System.out.println(supplier.get());

        Predicate<String> test = (a) -> a.equals("Sahana");

        TestFunctionalInterface<Student> testFunctionalInterface = System.out::println;
        testFunctionalInterface.doSomething(student);

        System.out.println(test.test("soumya"));
        Function<Integer, Boolean> function = (a) -> a>4;
        function.apply(7);

    }
}
