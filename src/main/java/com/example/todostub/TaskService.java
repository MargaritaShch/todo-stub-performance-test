package com.example.todostub;
import org.springframework.stereotype.Service;//бизнес-логика Srvice
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;//для генерации  ID

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public Task addTask(Task task){
        long id = idGenerator.incrementAndGet();//инкремент(+) id
        task.setId(id);//запись id
        task.setStatus("NEW");//установить статус
        tasks.put(id, task);//сложить в Map
        return task;
    }

    //возврат списка всех задач
    public List<Task> getAllTasks(){
        return new ArrayList<>(tasks.values());
    }

    public Task markAsComplete(Long id){
        Task task = tasks.get(id);//получить задачу
        //если задача не равно null поменять статус
        if(task != null){
            task.setStatus("DONE");
        }
        return task;
    }
}
