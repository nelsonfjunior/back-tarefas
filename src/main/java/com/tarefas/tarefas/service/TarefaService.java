package com.tarefas.tarefas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tarefas.tarefas.model.Tarefa;
import com.tarefas.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository tarefaRepository;

    public ResponseEntity<Tarefa> salvar(Tarefa tarefa){
        return ResponseEntity.ok(tarefaRepository.save(tarefa));
    }

    public ResponseEntity<Tarefa> buscarPorId(int id){
        return ResponseEntity.ok(tarefaRepository.findById(id).get());
    }

    public ResponseEntity<Tarefa> atualizar(Tarefa tarefa, int id){
        Tarefa tarefaEncontrada = tarefaRepository.findById(id).orElseThrow();
        tarefaEncontrada.setNome(tarefa.getNome());
        tarefaEncontrada.setCusto(tarefa.getCusto());
        tarefaEncontrada.setDataLimite(tarefa.getDataLimite());
        tarefaEncontrada.setOrdemApresentacao(tarefa.getOrdemApresentacao());
        return ResponseEntity.ok(tarefaRepository.save(tarefaEncontrada));
    }

    public ResponseEntity<Void> deletar(int id){
        tarefaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<List<Tarefa>> listar(){
        return ResponseEntity.ok(tarefaRepository.findAll());
    }
}
