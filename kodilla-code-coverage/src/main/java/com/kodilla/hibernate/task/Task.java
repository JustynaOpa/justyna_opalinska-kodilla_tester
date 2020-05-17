package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TASK")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task(){
    }

    public Task(String description, int duration){
        this.description = description;
        this.duration = duration;
        this.created = LocalDate.now();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId(){
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription(){
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public LocalDate getCreated(){
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration(){
        return duration;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASK_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList(){
        return taskList;
    }

    public void setTaskList(TaskList taskList){
        this.taskList = taskList;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails){
        this.taskFinancialDetails = taskFinancialDetails;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setDescription(String description){
        this.description = description;
    }

    private void setCreated(LocalDate created){
        this.created = created;
    }

    private void setDuration(int duration){
        this.duration = duration;
    }


}
