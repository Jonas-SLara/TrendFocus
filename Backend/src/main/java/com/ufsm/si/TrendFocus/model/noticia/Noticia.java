package com.ufsm.si.TrendFocus.model.noticia;

import java.time.LocalDateTime;
import java.util.HashSet;

import com.ufsm.si.TrendFocus.model.termo.Termo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "noticia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo") private String titulo;
    
    @Column(name = "resumo") private String resumo;

    @Column(name = "url_original") private String urlOriginal;

    @Column(name = "url_imagem") private String urlImagem;

    @Column(name = "fonte") private String fonte;

    @Column(name = "data_publicacao") private LocalDateTime dataPublicacao;

    @Column(name = "data_coleta") private LocalDateTime dataColeta;

    @ManyToMany
    @JoinTable(
        name = "noticia_termo",
        joinColumns = @JoinColumn(name="noticia_id"),
        inverseJoinColumns = @JoinColumn(name="termo_id")
    )
    private HashSet<Termo> termos;
}
