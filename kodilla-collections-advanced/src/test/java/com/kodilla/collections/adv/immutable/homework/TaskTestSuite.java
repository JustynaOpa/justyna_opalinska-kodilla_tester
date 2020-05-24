package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTestSuite {

    @Test
    public void shouldReturnTitleAndDuration(){
        Task task = new Task("Shopping", 60);
        Task task1 = new Task("Exercising", 90);
         int duration = task.getDuration();
         int duration1 = task1.getDuration();
         String title = task.getTitle();
         String title1 = task1.getTitle();
         assertEquals(60, duration);
         assertEquals(90, duration1);
         assertEquals("Shopping", title);
         assertEquals("Exercising",title1);
    }
}
