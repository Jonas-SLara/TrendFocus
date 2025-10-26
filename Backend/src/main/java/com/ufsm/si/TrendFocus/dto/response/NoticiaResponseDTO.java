package com.ufsm.si.TrendFocus.dto.response;

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
public class NoticiaResponseDTO {
    private String titulo;
    private LocalDateTime dataColeta;
    private LocalDateTime dataPublicacao;
    private String fonte;
    private String urlImagem;
    private String urlOriginal;
    private List<String> termos;
}
