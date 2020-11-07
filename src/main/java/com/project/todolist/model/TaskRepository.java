package com.project.todolist.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.net.ContentHandler;
import java.util.List;
import java.util.Optional;

 public interface TaskRepository {
    List<Task>findAll();

    Page<Task> findAll(Pageable page);

    Optional<Task> findById(Integer i);

    Task save(Task entity);

    List<Task> findByDone(@Param("state") boolean done);

    boolean existsById(Integer id);
 }
