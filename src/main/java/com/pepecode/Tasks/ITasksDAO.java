package com.pepecode.Tasks;

import java.net.Inet4Address;
import java.util.List;
import java.util.Optional;

public interface ITasksDAO {
    List<Tasks> getAllTasks();
    Optional<Tasks> getTaskById(Integer id);
    boolean checkTaskExistsById(Integer id);
    void addTask(Tasks tasks);
    void deleteTaskById(Integer id);
    void updateTask(Tasks update);
}
