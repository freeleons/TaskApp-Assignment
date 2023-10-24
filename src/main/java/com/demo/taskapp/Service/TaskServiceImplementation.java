package com.demo.taskapp.Service;

import com.demo.taskapp.Model.Task;
import com.demo.taskapp.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImplementation implements TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Optional<Task> optionalTask=taskRepository.findById(id);
        if(optionalTask.isPresent()) {
            Task updateTask = optionalTask.get();
            updateTask.setId(id);
            updateTask.setTitle(task.getDescription());
            updateTask.setDescription(task.getDescription());
            updateTask.setCompleted(task.getCompleted());
            updateTask.setCompletedDate(task.getCompletedDate());
            return taskRepository.save(updateTask);
        }
        else
        {
            return null;
        }
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
