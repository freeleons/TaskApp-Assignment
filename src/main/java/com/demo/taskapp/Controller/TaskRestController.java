package com.demo.taskapp.Controller;

import com.demo.taskapp.Model.Task;
import com.demo.taskapp.Service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@Slf4j
public class TaskRestController {
    private final Logger logger = LoggerFactory.getLogger(TaskRestController.class);
    private final TaskService taskService;

    @Autowired
    public TaskRestController(TaskService taskService) {
        this.taskService = taskService;
    }


    @RequestMapping(value = "/tasks",
            method = GET,
            produces = "application/json")
    List<Task> getTasks() {
        logger.info("getTasks() method called");
        return taskService.getAllTasks();
    }

    @RequestMapping(value = "/task/{id}",
            method = GET,
            produces = "application/json")
    Task getTaskById(@PathVariable Long id) {
        logger.info("getTaskById() method called, id = " + id.toString());
        return taskService.getTaskById(id).orElse(null);
    }

    @RequestMapping(value = "/create-task",
            method = POST,
            consumes = "application/json")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        logger.info("createTask() method called");
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @RequestMapping(value = "/update-task/{id}",
            method = PUT,
            consumes = "application/json")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        logger.info("updateTask() method called, id = " + id.toString());
        return ResponseEntity.ok(taskService.updateTask(id, task));
    }
}
