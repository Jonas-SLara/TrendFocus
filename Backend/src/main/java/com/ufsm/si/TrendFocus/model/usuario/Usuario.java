package com.ufsm.si.TrendFocus.model.usuario;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome") private String nome;

    @Column(name = "senha") private String senha;

    @Column(name = "email") private String email;

    @Column(name = "created") private LocalDateTime dataCriado;

    @Column(name = "ativo") private boolean ativo;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private Role tipo;
}
