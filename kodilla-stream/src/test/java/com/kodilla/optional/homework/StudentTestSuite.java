package com.kodilla.optional.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentTestSuite {

    @Test
    public void shouldReturnStudentsNameAndTeacher(){
        Teacher teacher = new Teacher("John Big");
        Student student = new Student("Marta May", teacher);

        String name = student.getName();
        Teacher teach = student.getTeacher();

        Assert.assertEquals("Marta May", name);
        Assert.assertEquals(teacher,teach);
    }
}
