package org.mroczek.service;

import org.mroczek.model.ListOfTask;
import org.mroczek.model.repo.ListOfTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {

    @Autowired
    ListOfTaskRepository listOfTaskRepository;

    public List<ListOfTask> getAll() {
        return listOfTaskRepository.findAll();
    }

    public void addList(String listName) {
        listOfTaskRepository.save(ListOfTask.builder().name(listName).build());
    }
}
