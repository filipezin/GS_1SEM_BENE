package br.com.iaqua.model.Planta;

import jakarta.persistence.Embeddable;

@Embeddable
public class Gorduras {


    private Double saturada;

    private Double monoinsaturada;

    private Double poliinsaturada;


    // ---------------------------- //


    public Gorduras() {
    }

    public Gorduras(Double saturada, Double monoinsaturada, Double poliinsaturada) {
        this.saturada = saturada;
        this.monoinsaturada = monoinsaturada;
        this.poliinsaturada = poliinsaturada;
    }


    // ---------------------------- //


    public Double getSaturada() {
        return saturada;
    }

    public Gorduras setSaturada(Double saturada) {
        this.saturada = saturada;
        return this;
    }

    public Double getMonoinsaturada() {
        return monoinsaturada;
    }

    public Gorduras setMonoinsaturada(Double monoinsaturada) {
        this.monoinsaturada = monoinsaturada;
        return this;
    }

    public Double getPoliinsaturada() {
        return poliinsaturada;
    }

    public Gorduras setPoliinsaturada(Double poliinsaturada) {
        this.poliinsaturada = poliinsaturada;
        return this;
    }


    // ---------------------------- //


    @Override
    public String toString() {
        return "Gorduras{" +
                "saturada=" + saturada +
                ", monoinsaturada=" + monoinsaturada +
                ", poliinsaturada=" + poliinsaturada +
                '}';
    }
}
