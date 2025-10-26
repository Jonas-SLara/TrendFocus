package com.ufsm.si.TrendFocus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufsm.si.TrendFocus.dto.request.TopicoRequestDTO;
import com.ufsm.si.TrendFocus.dto.response.TopicoResponseDTO;
import com.ufsm.si.TrendFocus.service.TopicoService;

import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/topico")
public class TopicoController {

    private final TopicoService topicoService;

    public TopicoController(TopicoService topicoService){
        this.topicoService = topicoService;
    }

    @GetMapping
    public ResponseEntity<List<TopicoResponseDTO>> listar() {
        return ResponseEntity.ok().body(topicoService.listar());
    }

    @PostMapping
    public ResponseEntity<TopicoResponseDTO> salvar(
            @RequestBody @Valid TopicoRequestDTO novo,
            UriComponentsBuilder uBuilder) {

        TopicoResponseDTO topico = topicoService.salvar(novo);
        URI location = uBuilder.path("/topico/{nome}")
                .buildAndExpand(topico.getTitulo())
                .toUri();
        return ResponseEntity.created(location).body(topico);
    }   
}
