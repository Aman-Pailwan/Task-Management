package com.pepecode.Controller;

import com.pepecode.Request.UpdateRequest;
import com.pepecode.Tasks.Tasks;
import com.pepecode.Request.TasksRegisterationRequest;
import com.pepecode.Tasks.TasksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TasksController {
    private final TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @GetMapping
    public List<Tasks> getTasks(){
        return tasksService.getAllTasks();
    }

    @GetMapping("{task_id}")
    public Tasks fetchTaskById(@PathVariable(value = "task_id",required = false) Integer tasks_id){
        return tasksService.getTaskById(tasks_id);
    }
    @PostMapping
    public void addTask(@RequestBody TasksRegisterationRequest tasksRegisterationRequest){
        tasksService.insertTask(tasksRegisterationRequest);
    }
    @DeleteMapping("{task_id}")
    public void removeTask(@PathVariable(value = "task_id")Integer task_id){
        tasksService.deleteTask(task_id);
    }

    @PutMapping("{task_id}")
    public void updateTask(@PathVariable(value = "task_id")Integer task_id, @RequestBody UpdateRequest updateRequest){
        tasksService.updateTask(task_id,updateRequest);
    }

}
