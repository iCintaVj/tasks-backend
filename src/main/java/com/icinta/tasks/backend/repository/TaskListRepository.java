package com.icinta.tasks.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icinta.tasks.backend.model.TaskList;

public interface TaskListRepository extends JpaRepository<TaskList, Long> {
    
}
