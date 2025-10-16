package com.ufsm.si.TrendFocus.model.termo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TermoDTO {

    private String termo;
    private String categoria;

    public TermoDTO(Termo termo){
        this.termo = termo.getTermo();
        this.categoria = termo.getCategoria().getTitulo();
    }
}
