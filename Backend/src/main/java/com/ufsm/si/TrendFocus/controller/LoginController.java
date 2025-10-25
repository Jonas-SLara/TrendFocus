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

import com.ufsm.si.TrendFocus.dto.request.LoginRequestDTO;
import com.ufsm.si.TrendFocus.dto.response.LoginResponseDTO;
import com.ufsm.si.TrendFocus.infra.security.TokenServiceJWT;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final AuthenticationManager manager;
    private final TokenServiceJWT tokenServiceJWT;

    public LoginController(AuthenticationManager manager, TokenServiceJWT tokenServiceJWT){
        this.manager = manager;
        this.tokenServiceJWT = tokenServiceJWT;
    }

    //implementação da autenticação vai aqui
    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO dados){
        
        Authentication authentication = new UsernamePasswordAuthenticationToken(dados.getEmail(), dados.getSenha());
        Authentication aut = manager.authenticate(authentication);

        User usuario = (User) aut.getPrincipal();
        String token = tokenServiceJWT.gerarToken(usuario);

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }
}
