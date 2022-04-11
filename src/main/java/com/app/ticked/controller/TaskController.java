package com.app.ticked.controller;

import com.app.ticked.task.TickedTask;
import com.app.ticked.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<TickedTask> getAllTasks() {
        List<TickedTask> list = taskService.getAllData();
//        String allTasks = "";
//        for(TickedTask task: list) {
//            allTasks = allTasks + task.getName() + ", \n";
//        }
        return list;
    }

    @GetMapping("/task/{name}")
    public TickedTask getTask(@PathVariable String name) {
        List<TickedTask> tasks = taskService.getAllData();

        for(TickedTask task: tasks) {
            if(task.getName().equals(name)) {
                return task;
            }
        }

        return taskService.notFoundTask();

    }
}
