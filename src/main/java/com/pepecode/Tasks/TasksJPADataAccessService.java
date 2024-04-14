package com.pepecode.Tasks;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("jpa")
public class TasksJPADataAccessService implements ITasksDAO {


    private final TasksRepository tasksRepository;

    public TasksJPADataAccessService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @Override
    public List<Tasks> getAllTasks() {
        return tasksRepository.findAll();
    }

    @Override
    public Optional<Tasks> getTaskById(Integer id) {
        return tasksRepository.findById(id);
    }

    @Override
    public void addTask(Tasks tasks) {
        tasksRepository.save(tasks);
    }

    @Override
    public boolean checkTaskExistsById(Integer id) {
        return tasksRepository.existsTasksById(id);
    }

    @Override
    public void deleteTaskById(Integer id) {
        tasksRepository.deleteById(id);
    }

    @Override
    public void updateTask(Tasks update) {
        tasksRepository.save(update);
    }
}
