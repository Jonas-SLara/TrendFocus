package com.ufsm.si.TrendFocus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ufsm.si.TrendFocus.dto.request.TopicoRequestDTO;
import com.ufsm.si.TrendFocus.dto.response.TopicoResponseDTO;
import com.ufsm.si.TrendFocus.mapper.TopicoMapper;
import com.ufsm.si.TrendFocus.model.Topico;
import com.ufsm.si.TrendFocus.repositories.TopicoRepository;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;

    public TopicoService(TopicoRepository topicoRepository){
        this.topicoRepository = topicoRepository;
    }

    public TopicoResponseDTO salvar(TopicoRequestDTO topico){
        Topico novo = TopicoMapper.toEntity(topico);
        return TopicoMapper.toResponse(topicoRepository.save(novo), null);
    }

    public List<TopicoResponseDTO> listar(){
        return topicoRepository.findAll()
            .stream()
            .map(topico -> TopicoMapper.toResponse(topico, null))
            .toList();
    }

}
