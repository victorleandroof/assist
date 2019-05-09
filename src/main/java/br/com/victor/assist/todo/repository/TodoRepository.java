package br.com.victor.assist.todo.repository;

import br.com.victor.assist.todo.domain.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends MongoRepository<Todo,String> {

    List<Todo> findByTitle(String title);
    List<Todo> findByStatus(String status);

}
