package com.ufsm.si.TrendFocus.model.termo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TermoDTO {
    private Long id;
    private String termo;
    private String topico;

    public TermoDTO(Termo termo){
        this.id = termo.getId();
        this.termo = termo.getTermo();
        this.topico = termo.getTopico().getTitulo(); 
    }
}
