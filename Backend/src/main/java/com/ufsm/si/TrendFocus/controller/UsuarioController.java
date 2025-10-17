package com.ufsm.si.TrendFocus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufsm.si.TrendFocus.model.usuario.UsuarioDTO;
import com.ufsm.si.TrendFocus.model.usuario.UsuarioRegisterDTO;
import com.ufsm.si.TrendFocus.service.UsuarioService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> criar(@RequestBody @Valid UsuarioRegisterDTO ur, UriComponentsBuilder uriBuilder) {       
        UsuarioDTO ud = this.service.salvar(ur);
        
        //isso aqui cria a url do novo recurso de usuario e devolver no cabeçalho location da resposta
        URI uri = uriBuilder.path("/usuario/{id}")
        .buildAndExpand(ud.getId()).toUri();

        return ResponseEntity.created(uri).body(ud);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(this.service.listar());
    }

}
