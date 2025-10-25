package com.ufsm.si.TrendFocus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufsm.si.TrendFocus.model.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long>{

    
} 
