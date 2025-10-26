package com.ufsm.si.TrendFocus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufsm.si.TrendFocus.dto.request.NoticiaRegisterDTO;
import com.ufsm.si.TrendFocus.dto.response.NoticiaResponseDTO;
import com.ufsm.si.TrendFocus.model.enums.AreaConhecimentoEnum;
import com.ufsm.si.TrendFocus.service.NoticiaService;

import jakarta.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/noticia")
public class NoticiaController {

    private final NoticiaService noticiaService;

    public NoticiaController(NoticiaService noticiaService){
        this.noticiaService = noticiaService;
    }

    @GetMapping
    public ResponseEntity<Page<NoticiaResponseDTO>> listar(
            @RequestParam(required = false) AreaConhecimentoEnum area,
            @RequestParam(required = false) Long termoId,
            Pageable pageable) {
        Page<NoticiaResponseDTO> page = noticiaService.listar(area, termoId, pageable);
        return ResponseEntity.ok().body(page);
    }

    @PostMapping
    public ResponseEntity<NoticiaResponseDTO> salvar(@RequestBody @Valid NoticiaRegisterDTO dto ) {
        NoticiaResponseDTO noticia = this.noticiaService.salvar(dto);
        return ResponseEntity.ok().body(noticia);
    }
    
    @DeleteMapping ResponseEntity<?> deletar(@RequestParam Long id){
        this.noticiaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
