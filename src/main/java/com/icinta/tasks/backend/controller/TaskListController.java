package com.icinta.tasks.backend.controller;

import com.icinta.tasks.backend.model.TaskList;
import com.icinta.tasks.backend.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasklists")
public class TaskListController {

    private final TaskListService taskListService;

    @Autowired
    public TaskListController(TaskListService taskListService) {
        this.taskListService = taskListService;
    }

    @GetMapping
    public List<TaskList> getAllTaskLists() {
        return taskListService.getAllTaskLists();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskList> getTaskListById(@PathVariable String id) {
        return ResponseEntity.ok(taskListService.getTaskListById(id));
    }

    @PostMapping
    public ResponseEntity<TaskList> createTaskList(@RequestBody TaskList taskList) {
        return ResponseEntity.ok(taskListService.createTaskList(taskList));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskList> updateTaskList(@PathVariable String id, @RequestBody TaskList updatedTaskList) {
        return ResponseEntity.ok(taskListService.updateTaskList(id, updatedTaskList));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskList(@PathVariable String id) {
        taskListService.deleteTaskList(id);
        return ResponseEntity.noContent().build();
    }
}