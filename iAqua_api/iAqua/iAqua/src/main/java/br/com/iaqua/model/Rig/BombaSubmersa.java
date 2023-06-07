package br.com.iaqua.model.Rig;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BombaSubmersa {


    private Double fluxoAgua;

    private Boolean ligado;

    public Double getFluxoAgua() {
        return fluxoAgua;
    }

    public BombaSubmersa setFluxoAgua(Double fluxoAgua) {
        this.fluxoAgua = fluxoAgua;
        return this;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public BombaSubmersa setLigado(Boolean ligado) {
        this.ligado = ligado;
        return this;
    }
}
