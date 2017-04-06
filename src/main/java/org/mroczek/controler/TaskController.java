package org.mroczek.controler;

import lombok.extern.slf4j.Slf4j;
import org.mroczek.model.Task;
import org.mroczek.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "/{listId}", method = GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Collection<Task> getTaskByListId(@PathVariable String listId) {
        return taskService.getTasksByListId(listId);
    }
}
