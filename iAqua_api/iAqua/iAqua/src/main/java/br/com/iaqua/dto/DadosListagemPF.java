package br.com.iaqua.dto;

import br.com.iaqua.model.Cliente.EstadoCivil;
import br.com.iaqua.model.Cliente.PessoaFisica;
import br.com.iaqua.model.Cliente.Sexo;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosListagemPF(

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
    public DadosListagemPF(PessoaFisica pf){
        this(
                pf.getId(),
                pf.getNome(),
                pf.getEndereco(),
                pf.getTelefone(),
                pf.getEmail(),
                pf.getDtContratacaoServico(),
                pf.getCpf(),
                pf.getDtNascimento(),
                pf.getSexo(),
                pf.getEstadoCivil(),
                pf.getFilhos(),
                pf.getRendaMedia(),
                pf.getRendaPerCapita(),
                pf.getSenha()

        );
    }
}
