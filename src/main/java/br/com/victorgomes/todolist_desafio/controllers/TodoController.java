package br.com.victorgomes.todolist_desafio.controllers;

import br.com.victorgomes.todolist_desafio.entities.Todo;
import br.com.victorgomes.todolist_desafio.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @PostMapping
    List<Todo> create(Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    List<Todo> update(Todo todo){
        return todoService.update(todo);
    }
    @PutMapping("/{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
}
