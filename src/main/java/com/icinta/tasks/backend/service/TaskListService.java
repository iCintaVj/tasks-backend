package com.icinta.tasks.backend.service;

import com.icinta.tasks.backend.model.TaskList;
import com.icinta.tasks.backend.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {

    private final TaskListRepository taskListRepository;

    @Autowired
    public TaskListService(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    public List<TaskList> getAllTaskLists() {
        return taskListRepository.findAll();
    }

    public TaskList getTaskListById(Long id) {
        return taskListRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("TaskList with id " + id + " not found"));
    }

    public TaskList createTaskList(TaskList taskList) {
        return taskListRepository.save(taskList);
    }

    public TaskList updateTaskList(Long id, TaskList updatedTaskList) {
        TaskList existingTaskList = getTaskListById(id);
        existingTaskList.setName(updatedTaskList.getName());
        return taskListRepository.save(existingTaskList);
    }

    public void deleteTaskList(Long id) {
        taskListRepository.deleteById(id);
    }
}