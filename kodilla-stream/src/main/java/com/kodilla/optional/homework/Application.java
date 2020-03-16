package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Adam Sand");
        Teacher teacher2 = new Teacher("Eva Black");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", teacher1));
        students.add(new Student("John", teacher2));
        students.add(new Student("Bill", null));
        students.add(new Student("Ola", null));
        students.add(new Student("Emma", teacher1));

        for( Student result: students)
            System.out.println("Student: "+ result.name +" teacher: " + result.teacher);

        Student student= new Student("Adam", null);
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        optionalStudent.ifPresent(u -> System.out.println(u.getTeacher()+" <undefined>"));



    }
}
