package com.kodilla.stream.homework;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TaskTestSuite {

    @Test
    public void shouldReturnAll(){
        //given
        LocalDate open = LocalDate.of(2019,6,12);
        LocalDate close = LocalDate.of(2020,5,28);
        Task task = new Task("Restore", open, close);

        //when
        String name = task.getName();
        LocalDate op = task.getOpened();
        LocalDate cl = task.getDeadline();

        //then
        Assert.assertEquals("Restore", name);
        Assert.assertEquals(open, op);
        Assert.assertEquals(close, cl);
    }
}
