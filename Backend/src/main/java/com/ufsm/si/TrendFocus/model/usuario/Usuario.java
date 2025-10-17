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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @Size(min=3, max=50, message = "nome deve ter de 3 a 50 caracteres")
    @Column(name = "nome")
    private String nome;

    @Size(min=6, message="a senha tem que ter no mínimo 6 caracteres")
    @Column(name = "senha")
    private String senha;

    @Email(message = "email inválido")
    @NotBlank(message = "email é obrigatório")
    @Column(name = "email") 
    private String email;

    @Column(name = "created") 
    private LocalDateTime dataCriado;

    @Column(name = "ativo") 
    private boolean ativo;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private Role tipo;
}
