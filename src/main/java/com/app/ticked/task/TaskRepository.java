package com.app.ticked.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TickedTask,Long> {
}
