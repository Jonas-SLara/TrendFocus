package com.ufsm.si.TrendFocus.model.usuario;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class DadosAutenticacao {
    @Email
    @NonNull
    private String email;
    @NonNull
    private String senha;
}
