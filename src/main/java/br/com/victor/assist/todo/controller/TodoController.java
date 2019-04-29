package br.com.victor.assist.todo.controller;

import br.com.victor.assist.todo.domain.Todo;
import br.com.victor.assist.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "all",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.GET)
    public List<Todo> findAll(){
        return todoService.findAll();
    }

    @RequestMapping(value = "/",
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
                    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                    method = RequestMethod.POST)
    public ResponseEntity<Todo> save(@RequestBody Todo todo){
        return ResponseEntity.ok(todoService.save(todo));
    }

    @RequestMapping(value = "edit",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.POST)
    public ResponseEntity<Todo> edit(@RequestBody Todo todo){
        return ResponseEntity.ok(todoService.edit(todo));
    }


    @RequestMapping(value = "find/t",
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Todo> findByTItle(@RequestParam(value = "title",required = true)String title){
        return todoService.findByTitle(title);
    }

    @RequestMapping(value = "find/s",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Todo> findByStatus(@RequestParam(value = "status",required = true)String status){
        return todoService.findByTitle(status);
    }




}
