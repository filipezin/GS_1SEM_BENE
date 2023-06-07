package br.com.iaqua.dto;

import br.com.iaqua.model.Planta.Nutricao;
import br.com.iaqua.model.Planta.TipoFruto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPlanta(

        // OBRIGATÓRIOS
        @NotNull
        TipoFruto tipo,
        @NotBlank
        String nomeFruto,
        @NotBlank
        String fenotipo,
        @NotNull
        Nutricao tabelaNutricional

) {

}
