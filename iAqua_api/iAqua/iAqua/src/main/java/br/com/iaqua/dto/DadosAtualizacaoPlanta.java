package br.com.iaqua.dto;

import br.com.iaqua.model.Planta.Nutricao;
import br.com.iaqua.model.Planta.TipoFruto;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPlanta(

        // OBRIGATÓRIOS
        @NotNull
        Long id,



        //OPCIONAIS
        TipoFruto tipo,
        String nomeFruto,
        String fenotipo,
        Nutricao tabelaNutricional
) {}
