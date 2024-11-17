package com.nascimento.padroes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nascimento.padroes.model.Cliente;
import com.nascimento.padroes.service.ClienteService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Cliente>> buscarTodos(@RequestParam String param) {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }
    
    @PostMapping("/")
    public ResponseEntity<Cliente> inserirCliente(@RequestBody Cliente cliente) {
        //TODO: process POST request
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        //TODO: process POST request
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        //TODO: process PUT request
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
    
}
