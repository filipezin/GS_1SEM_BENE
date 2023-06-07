package br.com.iaqua.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroPJ(

        // OBRIGATÓRIOS
        @NotBlank
        String nome,
        @NotBlank
        String endereco,
        @NotBlank
        String telefone,
        @NotBlank
        String email,
        @NotNull
        LocalDate dtContratacaoServico,
        @NotBlank
        String cnpj,
        @NotBlank
        String senha




) {
}
