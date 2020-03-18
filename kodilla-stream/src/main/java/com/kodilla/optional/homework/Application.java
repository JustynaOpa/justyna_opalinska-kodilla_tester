package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", new Teacher("Adam Sand")));
        students.add(new Student("John", new Teacher("Eva Black")));
        students.add(new Student("Bill", new Teacher("")));
        students.add(new Student("Ola", new Teacher("")));
        students.add(new Student("Emma", new Teacher("Adam Sand")));


        for (Student result : students) {
            System.out.println("Student: " + result.getName() + " teacher: " + result.getTeacher());

            Optional<List<Student>> optionalStudent = Optional.ofNullable(students);
            optionalStudent.ifPresent(u -> System.out.println("Student: " + result.getName() + " teacher: <undefined> " ));

        }
    }
}
