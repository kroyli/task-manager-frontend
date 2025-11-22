package com.example.springtaskapi.repository;

import com.example.springtaskapi.model.Task;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {

    private final Map<Long, Task> storage = new HashMap<>();
    private long idSequence = 1;

    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(idSequence++);
        }
        storage.put(task.getId(), task);
        return task;
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }
}
