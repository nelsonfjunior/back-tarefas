package com.tarefas.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefas.tarefas.model.Tarefa;
import com.tarefas.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    
    @Autowired
    private TarefaService tarefaService;

    @PostMapping("/salvar")
    public ResponseEntity<Tarefa> salvar(@RequestBody Tarefa tarefa){
        return tarefaService.salvar(tarefa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable int id){
        return tarefaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@RequestBody Tarefa tarefa, @PathVariable int id){
        return tarefaService.atualizar(tarefa, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id){
        return tarefaService.deletar(id);
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<Tarefa>> listar(){
        return tarefaService.listar();
    }
    
}
