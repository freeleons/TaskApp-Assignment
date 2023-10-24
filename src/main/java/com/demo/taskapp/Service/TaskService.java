package com.demo.taskapp.Service;

import com.demo.taskapp.Model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task createTask(Task task);
    Optional<Task> getTaskById(Long id);
    Task updateTask(Long id, Task task);
    List getAllTasks();
}
