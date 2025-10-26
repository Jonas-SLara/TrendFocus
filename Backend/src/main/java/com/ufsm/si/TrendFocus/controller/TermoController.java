package com.ufsm.si.TrendFocus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufsm.si.TrendFocus.dto.request.TermoRequestDTO;
import com.ufsm.si.TrendFocus.dto.response.TermoResponseDTO;
import com.ufsm.si.TrendFocus.service.TermoService;

import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/termo")
public class TermoController {

    private final TermoService termoService;

    public TermoController(TermoService termoService){
        this.termoService = termoService;
    }

    @GetMapping
    public ResponseEntity<List<TermoResponseDTO>> listar() {
        return ResponseEntity.ok().body(termoService.listar());
    }
    
    @PostMapping
    public ResponseEntity<TermoResponseDTO> salvar(
            @RequestBody @Valid TermoRequestDTO novo,
            UriComponentsBuilder uBuilder) {

        TermoResponseDTO termo = termoService.salvar(novo);

        URI location = uBuilder.path("/termo/{nome}")
            .buildAndExpand(termo.getTermo())
            .toUri();

        return ResponseEntity.created(location).body(termo);
    }
    
}
