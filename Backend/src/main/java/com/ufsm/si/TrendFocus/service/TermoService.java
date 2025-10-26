package com.ufsm.si.TrendFocus.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ufsm.si.TrendFocus.dto.request.TermoRequestDTO;
import com.ufsm.si.TrendFocus.dto.response.TermoResponseDTO;
import com.ufsm.si.TrendFocus.mapper.TermoMapper;
import com.ufsm.si.TrendFocus.model.Termo;
import com.ufsm.si.TrendFocus.model.Topico;
import com.ufsm.si.TrendFocus.repositories.TermoRepository;
import com.ufsm.si.TrendFocus.repositories.TopicoRepository;

@Service
public class TermoService {

    private final TermoRepository termoRepository;
    private final TopicoRepository topicoRepository;

    public TermoService(
            TermoRepository termoRepository,
            TopicoRepository topicoRepository){
        this.termoRepository = termoRepository;
        this.topicoRepository = topicoRepository;
    }

    public TermoResponseDTO salvar(TermoRequestDTO termo){
        Optional<Topico> topico = topicoRepository.findByTitulo(termo.getTopico());
        if(!topico.isPresent()){
             throw new NoSuchElementException("topico: " + termo.getTopico() + " não encontrado");
        }
        Termo novo =  TermoMapper.toEntity(termo, topico.get());
        return TermoMapper.toResponse(termoRepository.save(novo));
    }

    public List<TermoResponseDTO> listar(){
        List<Termo> termos = termoRepository.findAll();
        return termos.stream().map(t -> TermoMapper.toResponse(t)).toList();
    }
}
