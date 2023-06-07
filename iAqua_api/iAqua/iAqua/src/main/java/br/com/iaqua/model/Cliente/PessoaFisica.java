package br.com.iaqua.model.Cliente;

import br.com.iaqua.dto.DadosAtualizacaoPF;
import br.com.iaqua.dto.DadosCadastroPF;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(
        name = "TB_PESSOA_FISICA",
        uniqueConstraints = @UniqueConstraint(
                name = "UK_CPF",
                columnNames = "NR_CPF"
        )
)
public class PessoaFisica {


    @Id
    @SequenceGenerator(
            name = "SQ_PESSOA_FISICA",
            sequenceName = "SQ_PESSOA_FISICA",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_PESSOA_FISICA"
    )
    @Column(name = "ID_PESSOA_FISICA")
    private Long id;

    @Column(name = "NM_PESSOA")
    private String nome;

    @Column(name = "DS_ENDERECO")
    private String endereco;

    @Column(name = "NR_TELEFONE")
    private String telefone;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "DT_CONTRATACAO")
    private LocalDate dtContratacaoServico;

    @Column(name = "NR_CPF")
    private String cpf;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate dtNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    @Column(name = "DS_ESTADO_CIVIL")
    private EstadoCivil estadoCivil;

    @Column(name = "NR_FILHOS")
    private Integer filhos;

    @Column(name = "DS_RENDA")
    private Double rendaMedia;

    @Column(name = "DS_RENDA_PER_CAPITA")
    private Double rendaPerCapita;

    @Column(name = "SENHA_ACESSO")
    private String senha;


    // ---------------------------- //


    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String nome, String endereco, String telefone, String email, LocalDate dtContratacaoServico, String cpf, LocalDate dtNascimento, Sexo sexo, EstadoCivil estadoCivil, Integer filhos, Double rendaMedia, Double rendaPerCapita, String senha) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dtContratacaoServico = dtContratacaoServico;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.filhos = filhos;
        this.rendaMedia = rendaMedia;
        this.rendaPerCapita = rendaPerCapita;
        this.senha = senha;
    }

    public PessoaFisica(DadosCadastroPF dadosCadastroPF) {
        this.nome = dadosCadastroPF.nome();
        this.endereco = dadosCadastroPF.endereco();
        this.telefone = dadosCadastroPF.telefone();
        this.email = dadosCadastroPF.email();
        this.dtContratacaoServico = dadosCadastroPF.dtContratacaoServico();
        this.cpf = dadosCadastroPF.cpf();
        this.dtNascimento = dadosCadastroPF.dtNascimento();
        this.sexo = dadosCadastroPF.sexo();
        this.estadoCivil = dadosCadastroPF.estadoCivil();
        this.filhos = dadosCadastroPF.filhos();
        this.rendaMedia = dadosCadastroPF.rendaMedia();
        this.rendaPerCapita = dadosCadastroPF.rendaPerCapita();
        this.senha = dadosCadastroPF.senha();
    }


// ---------------------------- //


    public void atualizaCadastro(DadosAtualizacaoPF dados){
        if(dados.nome() != null){
            this.setNome(dados.nome());
        }
        if(dados.endereco() != null){
            this.setEndereco(dados.endereco());
        }
        if(dados.telefone() != null){
            this.setTelefone(dados.telefone());
        }
        if(dados.email() != null){
            this.setEmail(dados.email());
        }
        if(dados.dtContratacaoServico() != null){
            this.setDtContratacaoServico(dados.dtContratacaoServico());
        }
        if(dados.cpf() != null){
            this.setCpf(dados.cpf());
        }
        if(dados.dtNascimento() != null){
            this.setDtNascimento(dados.dtNascimento());
        }
        if(dados.sexo() != null){
            this.setSexo(dados.sexo());
        }
        if(dados.estadoCivil() != null){
            this.setEstadoCivil(dados.estadoCivil());
        }
        if(dados.filhos() != null){
            this.setFilhos(dados.filhos());
        }
        if(dados.rendaMedia() != null){
            this.setRendaMedia(dados.rendaMedia());
        }
        if(dados.rendaPerCapita() != null){
            this.setRendaPerCapita(dados.rendaPerCapita());
        }
        if(dados.senha() != null){
            this.setSenha(dados.senha());
        }

    }

    public Long getId() {
        return id;
    }

    public PessoaFisica setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public PessoaFisica setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public PessoaFisica setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public PessoaFisica setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PessoaFisica setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getDtContratacaoServico() {
        return dtContratacaoServico;
    }

    public PessoaFisica setDtContratacaoServico(LocalDate dtContratacaoServico) {
        this.dtContratacaoServico = dtContratacaoServico;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public PessoaFisica setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
        return this;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public PessoaFisica setSexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public PessoaFisica setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Integer getFilhos() {
        return filhos;
    }

    public PessoaFisica setFilhos(Integer filhos) {
        this.filhos = filhos;
        return this;
    }

    public Double getRendaMedia() {
        return rendaMedia;
    }

    public PessoaFisica setRendaMedia(Double rendaMedia) {
        this.rendaMedia = rendaMedia;
        return this;
    }

    public Double getRendaPerCapita() {
        return rendaPerCapita;
    }

    public PessoaFisica setRendaPerCapita(Double rendaPerCapita) {
        this.rendaPerCapita = rendaPerCapita;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public PessoaFisica setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public boolean validaSenha(String senha) {
        return this.senha.equals(senha);
    }

    public PessoaFisica removeSenha() {
        this.senha = null;
        return this;
    }

    // ---------------------------- //


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dtContratacaoServico=" + dtContratacaoServico +
                ", cpf='" + cpf + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", sexo=" + sexo +
                ", estadoCivil=" + estadoCivil +
                ", filhos=" + filhos +
                ", rendaMedia=" + rendaMedia +
                ", rendaPerCapita=" + rendaPerCapita +
                ", senha='" + senha + '\'' +
                '}';
    }
}
