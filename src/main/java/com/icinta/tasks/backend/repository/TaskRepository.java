package com.icinta.tasks.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icinta.tasks.backend.model.Task;

public interface TaskRepository extends JpaRepository<Task, String> {

    
} 
