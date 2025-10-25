package com.ufsm.si.TrendFocus.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufsm.si.TrendFocus.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByEmail(String email);
}
