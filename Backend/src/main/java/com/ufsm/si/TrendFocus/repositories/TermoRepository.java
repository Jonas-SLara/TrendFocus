package com.ufsm.si.TrendFocus.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ufsm.si.TrendFocus.model.Termo;
import com.ufsm.si.TrendFocus.model.enums.AreaConhecimentoEnum;

@Repository
public interface TermoRepository extends JpaRepository<Termo, Long>{
    
    Optional<Termo> findById(Long id);

    Optional<Termo> findByTermo(String termo);

    //achar todos os termos de um tópico
    @Query("SELECT t FROM Termo t WHERE t.topico.id = :idTopico")
    List<Termo> buscarPorTopico(@Param("idTopico") Long idTopico);

    //achar todos os termos de uma area de conhecimento
    @Query("SELECT t FROM Termo t WHERE t.topico.areaConhecimento = :area")
    List<Termo> buscarPorAreaConhecimento(@Param("area") AreaConhecimentoEnum area);

} 
