package com.ufsm.si.TrendFocus.model.categoria;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoriaDTO {
    private String titulo;
    private String descricao;

    public CategoriaDTO(Categoria categoria){
        this.titulo = categoria.getTitulo();
        this.descricao = categoria.getDescricao();
    }
}
