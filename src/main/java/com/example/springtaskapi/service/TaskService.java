package com.example.springtaskapi.service;

import com.example.springtaskapi.model.Task;
import com.example.springtaskapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found: " + id));
    }

    public Task createTask(Task task) {
        return repository.save(task);
    }

    public Task updateTask(Long id, Task newData) {
        Task existing = getTaskById(id);

        existing.setTitle(newData.getTitle());
        existing.setDescription(newData.getDescription());
        existing.setCompleted(newData.isCompleted());

        return repository.save(existing);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
