package com.ufsm.si.TrendFocus.dto.request;

import com.ufsm.si.TrendFocus.model.enums.AreaConhecimentoEnum;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class TopicoRequestDTO {
    @NotBlank(message = "titulo do tópico é obrigatório")
    @NonNull private String titulo;

    private String descricao; //opcional

    @NonNull private AreaConhecimentoEnum areaConhecimento;
}
