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

    public Collection<Task> getTasksByListId(String listId) {
        return taskRepository.findByListId(listId);
    }
}
