package org.mroczek.controler;

import lombok.extern.slf4j.Slf4j;
import org.mroczek.model.ListOfTask;
import org.mroczek.request.ListCreateRequest;
import org.mroczek.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@RestController
public class ListController {

    @Autowired
    ListService listService;

    @RequestMapping(path = "/lists",method = GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Collection<ListOfTask> getLists() {
        return listService.getAll();
    }

    @RequestMapping(method = POST)
    public void addList(@RequestBody ListCreateRequest newList){
        listService.addList(newList.getListName());
    }


}
