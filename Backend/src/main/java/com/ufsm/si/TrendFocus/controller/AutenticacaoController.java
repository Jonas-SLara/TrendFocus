package com.ufsm.si.TrendFocus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufsm.si.TrendFocus.infra.security.TokenServiceJWT;
import com.ufsm.si.TrendFocus.model.usuario.DadosAutenticacao;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    private final AuthenticationManager manager;
    private final TokenServiceJWT tokenServiceJWT;

    public AutenticacaoController(AuthenticationManager manager, TokenServiceJWT tokenServiceJWT){
        this.manager = manager;
        this.tokenServiceJWT = tokenServiceJWT;
    }

    //implementação da autenticação vai aqui
    @PostMapping
    public ResponseEntity<?> login(@RequestBody @Valid DadosAutenticacao dados){
        
        Authentication authentication = new UsernamePasswordAuthenticationToken(dados.getEmail(), dados.getSenha());
        Authentication aut = manager.authenticate(authentication);

        User usuario = (User) aut.getPrincipal();
        String token = tokenServiceJWT.gerarToken(usuario);

        return ResponseEntity.ok().body(token);
    }
}
