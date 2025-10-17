package com.ufsm.si.TrendFocus.model.usuario;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {

    private Role tipo;
    private String nome;
    private LocalDateTime created;
    private Boolean ativo;
    private String email;
    private Long id;

    public UsuarioDTO(Usuario usuario){
        this.tipo = usuario.getTipo();
        this.ativo = usuario.isAtivo();
        this.created = usuario.getDataCriado();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.id = usuario.getId();
    }
}
