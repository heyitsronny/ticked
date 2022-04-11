package com.app.ticked.task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    public TickedTask notFoundTask() {
        return TickedTask.builder().name("No appropriate task found!").build();
    }

    public List<TickedTask> getAllData() {
        List<TickedTask> tasks = new ArrayList<TickedTask>();
        tasks.add( TickedTask.builder()
                        .name("Waschen")
                        .build());
        tasks.add( TickedTask.builder()
                .name("Gassi gehen")
                .build());

        return tasks;
    }


}
