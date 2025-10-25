package com.ufsm.si.TrendFocus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufsm.si.TrendFocus.model.Termo;

@Repository
public interface TermoRepository extends JpaRepository<Termo, Long>{
    
} 
