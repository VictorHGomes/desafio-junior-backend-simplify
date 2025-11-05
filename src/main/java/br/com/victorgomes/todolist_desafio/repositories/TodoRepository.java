package br.com.victorgomes.todolist_desafio.repositories;

import br.com.victorgomes.todolist_desafio.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {}
