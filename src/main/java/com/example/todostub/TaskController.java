package com.example.todostub;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return service.addTask(task);
    }

    @GetMapping 
    public List<Task> getTask(){
        return service.getAllTasks();
    }

    @PutMapping("/{id}/complete")
    public Task completeTask(@PathVariable Long id){
        return service.markAsComplete(id);
    }
}
