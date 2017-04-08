package org.mroczek.service;

import lombok.extern.slf4j.Slf4j;
import org.mroczek.model.Task;
import org.mroczek.model.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Task addTask(String listId, String description) {
        log.info("New task: "+ listId + description);
        return taskRepository.save(Task.builder().listId(listId).description(description).build());
    }

    public Collection<Task> getTasksByListId(String listId) {
        return taskRepository.findByListId(listId);
    }

    public void deleteTask(String taskId) {
        log.info("ID TASK TO DELETE " + taskId);
        taskRepository.delete(taskId);
    }

}
