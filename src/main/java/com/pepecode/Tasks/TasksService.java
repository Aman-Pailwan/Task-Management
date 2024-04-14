package com.pepecode.Tasks;

import com.pepecode.Exception.RequestValidationException;
import com.pepecode.Request.TasksRegisterationRequest;
import com.pepecode.Request.UpdateRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TasksService {
    private final ITasksDAO iTasksDAO;

    public TasksService(@Qualifier("jpa") ITasksDAO iTasksDAO) {
        this.iTasksDAO = iTasksDAO;
    }
    public List<Tasks> getAllTasks(){
        return iTasksDAO.getAllTasks();
    }

    public Tasks getTaskById(Integer id){
        return iTasksDAO.getTaskById(id).orElseThrow(() -> new IllegalArgumentException("Task with id %s Id does not exist".formatted(id)));
    }

    public void insertTask(TasksRegisterationRequest tasksRegisterationRequest){
        iTasksDAO.addTask(new Tasks(
                tasksRegisterationRequest.task_id(),
                tasksRegisterationRequest.taskName()
        ));
    }

    public void deleteTask(Integer id){
        if(!iTasksDAO.checkTaskExistsById(id)){
            throw new IllegalArgumentException("Task with %s id does not exist".formatted(id));
        }
        iTasksDAO.deleteTaskById(id);
    }

    public void updateTask(Integer taskId, UpdateRequest updateRequest) {
        Tasks task = iTasksDAO.getTaskById(taskId)
                .orElseThrow(() -> new IllegalArgumentException("Task with ID " + taskId + " does not exist"));

        if (updateRequest.taskName() != null && !Objects.equals(updateRequest.taskName(), task.getTaskName())) {
            task.setTaskName(updateRequest.taskName());
            iTasksDAO.updateTask(task);
        } else {
            throw new RequestValidationException("No data changes found");
        }
    }

}
