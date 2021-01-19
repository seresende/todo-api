package com.resoft.rstodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resoft.rstodo.model.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{

}
