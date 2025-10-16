package com.ufsm.si.TrendFocus.model.termo;

import com.ufsm.si.TrendFocus.model.categoria.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "termo_chave")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Termo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "termo")
    private String termo;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Categoria categoria;
}
