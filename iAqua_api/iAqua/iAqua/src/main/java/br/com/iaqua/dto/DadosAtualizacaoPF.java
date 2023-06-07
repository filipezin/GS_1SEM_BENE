package br.com.iaqua.dto;

import br.com.iaqua.model.Cliente.EstadoCivil;
import br.com.iaqua.model.Cliente.Sexo;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoPF(

        // OBRIGATÓRIOS
        @NotNull
        Long id,



        //OPCIONAIS
        String nome,
        String endereco,
        String telefone,
        String email,
        LocalDate dtContratacaoServico,
        String cpf,
        LocalDate dtNascimento,
        Sexo sexo,
        EstadoCivil estadoCivil,
        Integer filhos,
        Double rendaMedia,
        Double rendaPerCapita,
        String senha


) {
}
