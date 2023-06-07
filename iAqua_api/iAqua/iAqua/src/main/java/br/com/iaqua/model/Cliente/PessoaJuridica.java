package br.com.iaqua.model.Cliente;

import br.com.iaqua.dto.DadosAtualizacaoPJ;
import br.com.iaqua.dto.DadosCadastroPJ;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(
        name = "TB_PESSOA_JURIDICA",
        uniqueConstraints = @UniqueConstraint(
                name = "UK_CNPJ",
                columnNames = "NR_CNPJ"))
public class PessoaJuridica{

    @Id
    @SequenceGenerator(
            name = "SQ_PESSOA_JURIDICA",
            sequenceName = "SQ_PESSOA_JURIDICA",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_PESSOA_JURIDICA"
    )
    @Column(name = "ID_PESSOA_JURIDICA")
    private Long id;

    @Column(name = "NM_EMPRESA")
    private String nome;

    @Column(name = "DS_ENDERECO")
    private String endereco;

    @Column(name = "NR_TELEFONE")
    private String telefone;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "DT_CONTRATACAO")
    private LocalDate dtContratacaoServico;

    @Column(name = "NR_CNPJ")
    private String cnpj;

    @Column(name = "SENHA_ACESSO")
    private String senha;



    // ---------------------------- //


    public PessoaJuridica() {
    }


    public PessoaJuridica(Long id, String nome, String endereco, String telefone, String email, LocalDate dtContratacaoServico, String cnpj, String senha) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dtContratacaoServico = dtContratacaoServico;
        this.cnpj = cnpj;
        this.senha = senha;
    }

    public PessoaJuridica(DadosCadastroPJ dadosCadastroPJ) {
        this.nome = dadosCadastroPJ.nome();
        this.cnpj = dadosCadastroPJ.cnpj();
        this.endereco = dadosCadastroPJ.endereco();
        this.telefone = dadosCadastroPJ.telefone();
        this.email = dadosCadastroPJ.email();
        this.dtContratacaoServico = dadosCadastroPJ.dtContratacaoServico();
        this.senha = dadosCadastroPJ.senha();
    }



    // ---------------------------- //


    public void atualizaCadastro(DadosAtualizacaoPJ dados) {
        if (dados.nome() != null) {
            this.setNome(dados.nome());
        }
        if (dados.endereco() != null) {
            this.setEndereco(dados.endereco());
        }
        if (dados.telefone() != null) {
            this.setTelefone(dados.telefone());
        }
        if (dados.email() != null) {
            this.setEmail(dados.email());
        }
        if (dados.dtContratacaoServico() != null) {
            this.setDtContratacaoServico(dados.dtContratacaoServico());
        }
        if(dados.cnpj() !=  null){
            this.setCnpj(dados.cnpj());
        }
        if(dados.senha() != null){
            this.setSenha(dados.senha());
        }
    }

    public Long getId() {
        return id;
    }

    public PessoaJuridica setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public PessoaJuridica setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public PessoaJuridica setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public PessoaJuridica setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PessoaJuridica setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getDtContratacaoServico() {
        return dtContratacaoServico;
    }

    public PessoaJuridica setDtContratacaoServico(LocalDate dtContratacaoServico) {
        this.dtContratacaoServico = dtContratacaoServico;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public PessoaJuridica setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public boolean validaSenha(String senha) {
        return this.senha.equals(senha);
    }

    public PessoaJuridica removeSenha() {
        this.senha = null;
        return this;
    }


    // ---------------------------- //




}
