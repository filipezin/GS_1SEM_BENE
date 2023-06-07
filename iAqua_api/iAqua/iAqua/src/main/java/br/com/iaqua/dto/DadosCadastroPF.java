package br.com.iaqua.dto;

import br.com.iaqua.model.Cliente.EstadoCivil;
import br.com.iaqua.model.Cliente.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroPF(

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
        String cpf,
        @NotNull
        LocalDate dtNascimento,
        @NotNull
        Sexo sexo,
        @NotNull
        EstadoCivil estadoCivil,
        @NotBlank
        String senha,



        //OPCIONAIS
        Integer filhos,
        Double rendaMedia,
        Double rendaPerCapita



) {


}
