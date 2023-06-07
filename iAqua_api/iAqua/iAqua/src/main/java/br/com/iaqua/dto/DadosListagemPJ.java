package br.com.iaqua.dto;

import br.com.iaqua.model.Cliente.PessoaJuridica;

import java.time.LocalDate;

public record DadosListagemPJ(

        // OBRIGATÓRIOS
        Long id,



        //OPCIONAIS
        String nome,
        String endereco,
        String telefone,
        String email,
        LocalDate dt_contratacao_servico,
        String cnpj,
        String senha

) {

    public DadosListagemPJ(PessoaJuridica pj){
        this(
                pj.getId(),
                pj.getNome(),
                pj.getEndereco(),
                pj.getTelefone(),
                pj.getEmail(),
                pj.getDtContratacaoServico(),
                pj.getCnpj(),
                pj.getSenha()
        );
    }
}
