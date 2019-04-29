package br.com.victor.assist.todo.service;

import br.com.victor.assist.todo.domain.Todo;
import br.com.victor.assist.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class TodoServiceImpl implements  TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Todo save(Todo todo) {
        todo.setHoraDataInclusao(LocalDateTime.now());
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> findByTitle(String  title) {
        return todoRepository.findByTitle(title);
    }

    @Override
    public List<Todo> findByStatus(String status) {
        return todoRepository.findByStatus(status);
    }

    @Override
    public Todo edit(Todo todo) {
        return todoRepository.save(todo);
    }

}
