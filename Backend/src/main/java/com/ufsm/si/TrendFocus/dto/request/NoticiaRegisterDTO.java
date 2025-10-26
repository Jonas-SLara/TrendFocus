package com.ufsm.si.TrendFocus.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoticiaRegisterDTO {
    private String titulo;
    private String resumo;
    private LocalDateTime dataPublicacao;
    private String fonte;
    private String urlImagem;
    private String urlOriginal;
    //será passado uma lista de termos chaves
    private List<Long> termoId; 
}
