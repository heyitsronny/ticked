package com.app.ticked.task;

import lombok.Builder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/task")
@Builder
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/all")
    public List<TickedTask> getAllTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/{id}")
    public TickedTask getTask(@PathVariable Long id) {
//        List<TickedTask> tasks = taskService.getTasks();
//
//        for(TickedTask task: tasks) {
//            if(task.getName().equals(name)) {
//                return task;
//            }
//        }
//
//        return taskService.notFoundTask();
        return taskService.getTask(id);
    }
}
