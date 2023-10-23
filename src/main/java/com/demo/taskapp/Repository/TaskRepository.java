package com.demo.taskapp.Repository;

import com.demo.taskapp.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
