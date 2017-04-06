package org.mroczek.model.repo;

import org.mroczek.model.ListOfTask;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListOfTaskRepository extends MongoRepository<ListOfTask, String> {

}
