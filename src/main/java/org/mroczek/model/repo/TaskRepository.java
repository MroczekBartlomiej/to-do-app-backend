package org.mroczek.model.repo;

import org.mroczek.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByListId(String listId);
}
