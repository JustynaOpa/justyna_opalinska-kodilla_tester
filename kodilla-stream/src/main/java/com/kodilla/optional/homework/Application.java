package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", new Teacher("Adam Sand")));
        students.add(new Student("John", new Teacher("Eva Black")));
        students.add(new Student("Bill", null));
        students.add(new Student("Ola", null));
        students.add(new Student("Emma", new Teacher("Adam Sand")));


        for (Student result : students) {
            Optional<Teacher> teacher = Optional.ofNullable(result.getTeacher());
            System.out.println("Student name: "+ result.getName() + "Teacher name: " + teacher.orElse(new Teacher("<undefind>")).getName());

        }

    }
}
