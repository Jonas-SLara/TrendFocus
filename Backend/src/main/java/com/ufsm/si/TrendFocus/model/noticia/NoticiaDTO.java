package com.ufsm.si.TrendFocus.model.noticia;

import java.time.LocalDateTime;
import java.util.HashSet;

import com.ufsm.si.TrendFocus.model.categoria.Categoria;
import com.ufsm.si.TrendFocus.model.termo.Termo;

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
    private HashSet<Termo> termos;
    private HashSet<Categoria> categorias;

    public NoticiaDTO(Noticia noticia){
        this.titulo = noticia.getTitulo();
        this.dataColeta = noticia.getDataColeta();
        this.dataPublicacao = noticia.getDataPublicacao();
        this.fonte = noticia.getFonte();
        this.urlImagem = noticia.getUrlImagem();
        this.urlOriginal = noticia.getUrlOriginal();
        this.termos = noticia.getTermos();
        this.categorias = noticia.getCategorias();
    }
}
