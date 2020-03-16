package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        LocalDate p = LocalDate.of(2020, 01, 01);
        LocalDate k = LocalDate.of(2021, 01, 01);

        LocalDate p1 = LocalDate.of(2020, 01, 01);
        LocalDate k1 = LocalDate.of(2020, 03, 01);

        LocalDate p2 = LocalDate.of(2020, 03, 10);
        LocalDate k2 = LocalDate.of(2020, 05, 01);


        tasks.add(new Task("Blow", p, k));
        tasks.add(new Task("Flow", p1, k1));
        tasks.add(new Task("Grow", p2, k2));
        return tasks;
    }
}
