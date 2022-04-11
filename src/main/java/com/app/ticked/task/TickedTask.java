package com.app.ticked.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TickedTask {
    private Long id;
    private String name;
    private boolean ticked;
}
