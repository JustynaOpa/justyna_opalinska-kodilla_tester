package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTestSuite {
    @Autowired
    private TaskRepository taskRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskRepositorySave(){
        //given
        Task task = new Task(DESCRIPTION, 7);

        //when
        taskRepository.save(task);

        //then
        int id = task.getId();
        Optional<Task> readTask = taskRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //cleanUp
        taskRepository.deleteById(id);
    }
    @Test
    public void testTaskRepositoryFindByDuration(){
        //given
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //when
        List<Task> readTasks = taskRepository.findByDuration(duration);

        //then
        Assert.assertEquals(1, readTasks.size());

        //cleanUp
        int id = readTasks.get(0).getId();
        taskRepository.deleteById(id);
    }
    @Test
    public void testTaskRepositorySaveWithFinancialDetails(){

        //given
        Task task = new Task(DESCRIPTION, 30);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(financialDetails);

        //when
        taskRepository.save(task);
        int id = task.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        taskRepository.deleteById(id);
    }
}
