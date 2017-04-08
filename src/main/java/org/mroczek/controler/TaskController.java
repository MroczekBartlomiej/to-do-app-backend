package org.mroczek.controler;

import lombok.extern.slf4j.Slf4j;
import org.mroczek.model.Task;
import org.mroczek.request.TaskCreateRequest;
import org.mroczek.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    @RequestMapping(method = POST)
    public Task addTask(@RequestBody TaskCreateRequest task){
        return taskService.addTask(task.getListId(), task.getDescription());
    }

    @RequestMapping(path = "/{taskId}",method = DELETE)
    public void deleteTask(@PathVariable String taskId){
        taskService.deleteTask(taskId);
    }
}
