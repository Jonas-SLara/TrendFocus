package com.ufsm.si.TrendFocus.model.topico;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TopicoDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private String areaConhecimento;

    public TopicoDTO(Topico topico){
        this.id = topico.getId();
        this.areaConhecimento = topico.getAreaConhecimento().name();
        this.titulo = topico.getTitulo();
        this.descricao = topico.getDescricao();
    }
}
