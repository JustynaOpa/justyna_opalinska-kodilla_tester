package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> dates = TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().equals(currentDate))
                .map(w -> w.getDeadline())
                .collect(Collectors.toList());
        System.out.println(dates);

    }
}
