package com.ufsm.si.TrendFocus.model;

import java.util.HashSet;
import java.util.List;

import com.ufsm.si.TrendFocus.model.enums.AreaConhecimentoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "topico")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "area_conhecimento")
    private AreaConhecimentoEnum areaConhecimento;

    //bidirecionamento
    @OneToMany(mappedBy = "topico", fetch = FetchType.LAZY)
    private HashSet<Termo> termos;
}
