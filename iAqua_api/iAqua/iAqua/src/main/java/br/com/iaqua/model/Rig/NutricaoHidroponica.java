package br.com.iaqua.model.Rig;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class NutricaoHidroponica {


    private Double nitrogenio;

    private Double potassio;

    private Double fosforo;

    private Double calcio;

    private Double magnesio;

    private Double zinco;


    // ---------------------------- //


    public NutricaoHidroponica() {
    }

    public NutricaoHidroponica(Double nitrogenio, Double potassio, Double fosforo, Double calcio, Double magnesio, Double zinco) {
        this.nitrogenio = nitrogenio;
        this.potassio = potassio;
        this.fosforo = fosforo;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.zinco = zinco;
    }


    // ---------------------------- //


    public Double getNitrogenio() {
        return nitrogenio;
    }

    public NutricaoHidroponica setNitrogenio(Double nitrogenio) {
        this.nitrogenio = nitrogenio;
        return this;
    }

    public Double getPotassio() {
        return potassio;
    }

    public NutricaoHidroponica setPotassio(Double potassio) {
        this.potassio = potassio;
        return this;
    }

    public Double getFosforo() {
        return fosforo;
    }

    public NutricaoHidroponica setFosforo(Double fosforo) {
        this.fosforo = fosforo;
        return this;
    }

    public Double getCalcio() {
        return calcio;
    }

    public NutricaoHidroponica setCalcio(Double calcio) {
        this.calcio = calcio;
        return this;
    }

    public Double getMagnesio() {
        return magnesio;
    }

    public NutricaoHidroponica setMagnesio(Double magnesio) {
        this.magnesio = magnesio;
        return this;
    }

    public Double getZinco() {
        return zinco;
    }

    public NutricaoHidroponica setZinco(Double zinco) {
        this.zinco = zinco;
        return this;
    }


    // ---------------------------- //


    @Override
    public String toString() {
        return "NutricaoHidroponica{" +
                "nitrogenio=" + nitrogenio +
                ", potassio=" + potassio +
                ", fosforo=" + fosforo +
                ", calcio=" + calcio +
                ", magnesio=" + magnesio +
                ", zinco=" + zinco +
                '}';
    }
}
