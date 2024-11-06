package com.tarefas.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarefas.tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
    
}
