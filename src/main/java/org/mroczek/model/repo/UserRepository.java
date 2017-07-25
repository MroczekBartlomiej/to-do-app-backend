package org.mroczek.model.repo;

import org.mroczek.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUserName(String userName);
}
