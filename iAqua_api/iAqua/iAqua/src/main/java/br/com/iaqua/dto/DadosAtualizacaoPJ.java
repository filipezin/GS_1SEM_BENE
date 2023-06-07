package br.com.iaqua.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoPJ(

        // OBRIGATÓRIOS
        @NotNull
        Long id,



        //OPCIONAIS
        String nome,
        String endereco,
        String telefone,
        String email,
        LocalDate dtContratacaoServico,
        String cnpj,
        String senha
) {}