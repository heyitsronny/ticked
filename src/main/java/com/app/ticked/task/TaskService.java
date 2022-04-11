package com.app.ticked.task;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Builder
public class TaskService {

    private final TaskRepository taskRepository;

//    public TickedTask notFoundTask() {
//        return TickedTask.builder().name("No appropriate task found!").build();
//    }

//    public List<TickedTask> getTasks() {
//        List<TickedTask> tasks = List.of(
//            TickedTask.builder()
//                    .name("Waschen")
//                    .build(),
//            TickedTask.builder()
//                    .name("Gassi gehen")
//                    .build()
//        );
//        return tasks;
    public List<TickedTask> getTasks() {
        return taskRepository.findAll();
    }

    public TickedTask getTask(Long id) {
        return taskRepository.findById(id).orElseThrow(RuntimeException::new);
    }

}
