package com.pepecode.Tasks;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Tasks {
    @Id
    @SequenceGenerator(
            name = "tasks_id_sequence",
            sequenceName = "tasks_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tasks_id_sequence"
    )
    private Integer id ;
    @Column(
            nullable = false
    )
    private String taskName;

    public Tasks(String taskName) {
        this.taskName = taskName;
    }

    public Tasks(Integer id, String taskName) {
        this.id = id;
        this.taskName = taskName;
    }

    public Tasks() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return Objects.equals(id, tasks.id) && Objects.equals(taskName, tasks.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskName);
    }
}
