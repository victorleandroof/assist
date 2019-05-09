package br.com.victor.assist.todo.service;

import br.com.victor.assist.todo.domain.Todo;

import java.util.List;

public interface TodoService {

    Todo save(Todo todo);
    List<Todo> findAll();
    List<Todo> findByTitle(String title);
    List<Todo> findByStatus(String status);
    Todo edit(Todo todo);

}
