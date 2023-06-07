package br.com.iaqua.model.Planta;

import br.com.iaqua.dto.DadosAtualizacaoPlanta;
import br.com.iaqua.dto.DadosCadastroPlanta;
import jakarta.persistence.*;

@Entity
@Table(
        name = "TB_FRUTO",
        uniqueConstraints = @UniqueConstraint(
                name = "UK_FENOTIPO",
                columnNames = "NM_FENOTIPO"))
public class Fruto {

    @Id
    @SequenceGenerator(
            name = "SQ_FRUTO",
            sequenceName = "SQ_FRUTO",
            allocationSize = 1,
            initialValue = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_FRUTO")
    @Column(name = "ID_FRUTO")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_FRUTO")
    private TipoFruto tipo;

    @Column(name = "NM_FRUTO")
    private String nomeFruto;

    @Column(name = "NM_FENOTIPO")
    private String fenotipo;

    @Embedded
    private Nutricao tabelaNutricional;


    // ---------------------------- //


    public Fruto() {
    }

    public Fruto(Long id, TipoFruto tipo, String nomeFruto, String fenotipo, Nutricao tabelaNutricional) {
        this.id = id;
        this.tipo = tipo;
        this.nomeFruto = nomeFruto;
        this.fenotipo = fenotipo;
        this.tabelaNutricional = tabelaNutricional;
    }

    public Fruto(DadosCadastroPlanta dados){
        this.nomeFruto = dados.nomeFruto();
        this.tipo = dados.tipo();
        this.fenotipo = dados.fenotipo();
        this.tabelaNutricional = dados.tabelaNutricional();
    }


    // ---------------------------- //


    public void atualizaCadastro(DadosAtualizacaoPlanta dados){
        if(dados.nomeFruto() != null){
            this.setNomeFruto(dados.nomeFruto());
        }
        if(dados.tipo() != null){
            this.setTipo(dados.tipo());
        }
        if(dados.fenotipo() != null){
            this.setFenotipo(dados.fenotipo());
        }
        if(dados.tabelaNutricional() != null){
            this.setTabelaNutricional(dados.tabelaNutricional());
        }
    }

    public Long getId() {
        return id;
    }

    public Fruto setId(Long id) {
        this.id = id;
        return this;
    }

    public TipoFruto getTipo() {
        return tipo;
    }

    public Fruto setTipo(TipoFruto tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getNomeFruto() {
        return nomeFruto;
    }

    public Fruto setNomeFruto(String nomeFruto) {
        this.nomeFruto = nomeFruto;
        return this;
    }

    public String getFenotipo() {
        return fenotipo;
    }

    public Fruto setFenotipo(String fenotipo) {
        this.fenotipo = fenotipo;
        return this;
    }

    public Nutricao getTabelaNutricional() {
        return tabelaNutricional;
    }

    public Fruto setTabelaNutricional(Nutricao tabelaNutricional) {
        this.tabelaNutricional = tabelaNutricional;
        return this;
    }


    // ---------------------------- //


    @Override
    public String toString() {
        return "Fruto{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", nomeFruto='" + nomeFruto + '\'' +
                ", fenotipo='" + fenotipo + '\'' +
                ", tabelaNutricional=" + tabelaNutricional +
                '}';
    }
}
