package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StudentTestSuite {

    @Test
    public void shouldReturnStudentsFirstLastName(){
        Student student = new Student("Adam","Sandler");
        Student student2 = new Student("Brad","Pitt");

        String name = student.getFirstname();
        String name2 = student2.getFirstname();

        String lname = student.getLastname();
        String lname2 = student2.getLastname();

        assertEquals("Adam", name);
        assertEquals("Brad", name2);
        assertEquals("Pitt", lname2);
        assertEquals("Sandler", lname);

    }
}
