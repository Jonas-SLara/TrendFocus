package com.ufsm.si.TrendFocus.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TermoRequestDTO {
    @NotBlank(message = "nome é obrigatório")
    private String nome;
    @NotBlank(message = "nome do tópico é obrigatório")
    private String topico; //nome para o tópico associado
}
