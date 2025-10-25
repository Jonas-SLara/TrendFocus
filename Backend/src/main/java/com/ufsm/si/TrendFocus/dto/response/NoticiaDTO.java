package com.ufsm.si.TrendFocus.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import com.ufsm.si.TrendFocus.model.Noticia;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NoticiaDTO {
    private String titulo;
    private LocalDateTime dataColeta;
    private LocalDateTime dataPublicacao;
    private String fonte;
    private String urlImagem;
    private String urlOriginal;
    private List<String> termos;

    public NoticiaDTO(Noticia noticia){
        this.titulo = noticia.getTitulo();
        this.dataColeta = noticia.getDataColeta();
        this.dataPublicacao = noticia.getDataPublicacao();
        this.fonte = noticia.getFonte();
        this.urlImagem = noticia.getUrlImagem();
        this.urlOriginal = noticia.getUrlOriginal();
        //obter lista de termos
        this.termos = noticia.getTermos().stream()
        .map(t -> t.getTermo()).toList();
    }
}
