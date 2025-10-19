package com.ufsm.si.TrendFocus.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

@Service
public class TokenServiceJWT {

    public String gerarToken(User usuario){
        try {
            //NUNCA EXPOR O SECRET NO CÓDIGO
            Algorithm algorithm = Algorithm.HMAC256("1234");
            return JWT.create()
                .withIssuer("API TrendFocus")
                .withSubject(usuario.getUsername())
                //.withClaim()
                .withExpiresAt(dataExpiracao())
                .sign(algorithm);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro ao criar o token JWT ", exception);
        }
    }

    //defina um instante de 2h30min no fuso horário de brasilia
    private Instant dataExpiracao(){
        LocalDateTime fim = LocalDateTime.now().plusHours(2).plusMinutes(30);
        return fim.toInstant(ZoneOffset.of("-03:00"));
    }
}
