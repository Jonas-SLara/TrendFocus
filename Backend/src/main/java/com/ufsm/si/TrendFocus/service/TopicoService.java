package com.ufsm.si.TrendFocus.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        return TopicoMapper.toResponse(topicoRepository.save(novo));
    }

    public Page<TopicoResponseDTO> listar(Pageable pageable){
       return topicoRepository.buscarTodos(pageable)
            .map(topico -> TopicoMapper.toResponse(topico));
    }

}
