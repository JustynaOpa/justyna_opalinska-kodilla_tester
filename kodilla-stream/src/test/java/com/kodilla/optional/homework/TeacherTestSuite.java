package com.kodilla.optional.homework;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTestSuite {

    @Test
    public void shouldReturnTeacherName(){
        Teacher teacher = new Teacher("Adam Roy");
        String name = teacher.getName();
        Assert.assertEquals("Adam Roy", name);
    }
}
