package br.com.iaqua.model.Planta;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Nutricao {

    private Double porcao;

    @Column(name = "PROTEINAS")
    private Double proteina;

    @Column(name = "CARBOIDRATOS")
    private Double carboidrato;

    @Embedded
    private Gorduras gordura;

    @Column(name = "KCAL")
    private Double kcal;

    // ADICIONAR VITAMINAS


    // ---------------------------- //


    public Nutricao() {
    }

    public Nutricao(Double porcao, Double proteina, Double carboidrato, Gorduras gordura, Double kcal) {
        this.porcao = porcao;
        this.proteina = proteina;
        this.carboidrato = carboidrato;
        this.gordura = gordura;
        this.kcal = kcal;
    }

// ---------------------------- //


    public Double getPorcao() {
        return porcao;
    }

    public Nutricao setPorcao(Double porcao) {
        this.porcao = porcao;
        return this;
    }

    public Double getKcal() {
        return kcal;
    }

    public Nutricao setKcal(Double kcal) {
        this.kcal = kcal;
        return this;
    }

    public Double getProteina() {
        return proteina;
    }

    public Nutricao setProteina(Double proteina) {
        this.proteina = proteina;
        return this;
    }

    public Double getCarboidrato() {
        return carboidrato;
    }

    public Nutricao setCarboidrato(Double carboidrato) {
        this.carboidrato = carboidrato;
        return this;
    }

    public Gorduras getGordura() {
        return gordura;
    }

    public Nutricao setGordura(Gorduras gordura) {
        this.gordura = gordura;
        return this;
    }


    // ---------------------------- //


    @Override
    public String toString() {
        return "Nutricao{" +
                "proteina=" + proteina +
                ", carboidrato=" + carboidrato +
                ", gordura=" + gordura +
                '}';
    }
}
