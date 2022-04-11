package com.app.ticked;

import com.app.ticked.task.TickedTask;

import java.util.ArrayList;
import java.util.List;

public class Tasks {

    static List<TickedTask> tasks = new ArrayList<>() {{
        TickedTask.builder().name("Tabletten").build();
    }};

}
