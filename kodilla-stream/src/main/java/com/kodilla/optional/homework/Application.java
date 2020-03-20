package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", new Teacher("Adam Sand")));
        students.add(new Student("John", new Teacher("Eva Black")));
        students.add(new Student("Bill", new Teacher(null)));
        students.add(new Student("Ola", new Teacher(null)));
        students.add(new Student("Emma", new Teacher("Adam Sand")));


        for (Student result : students) {
            Optional<List<Student>> optionalStudent = Optional.ofNullable(students);
            optionalStudent.ifPresent(u -> System.out.println("Student: " + result.getName() + " teacher: " +result.getTeacher().getName()));

            if (result.getTeacher().getName() == null) {
                System.out.println("Student: " + result.getName()  + " teacher: <undefined> ");
            }
            }

    }
}
