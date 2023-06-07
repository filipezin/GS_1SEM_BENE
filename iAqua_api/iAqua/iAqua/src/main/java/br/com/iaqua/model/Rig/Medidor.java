package br.com.iaqua.model.Rig;

import jakarta.persistence.Embeddable;

@Embeddable
public class Medidor {

    private Double ph;

    private Double ec;

    private Double ppm;


    // ---------------------------- //


    public Medidor() {
    }

    public Medidor(Double ph, Double ec, Double ppm) {
        this.ph = ph;
        this.ec = ec;
        this.ppm = ppm;
    }


    // ---------------------------- //


    public Double getPh() {
        return ph;
    }

    public Medidor setPh(Double ph) {
        this.ph = ph;
        return this;
    }

    public Double getEc() {
        return ec;
    }

    public Medidor setEc(Double ec) {
        this.ec = ec;
        return this;
    }

    public Double getPpm() {
        return ppm;
    }

    public Medidor setPpm(Double ppm) {
        this.ppm = ppm;
        return this;
    }


    // ---------------------------- //


    @Override
    public String toString() {
        return "Medidor{" +
                "ph=" + ph +
                ", ec=" + ec +
                ", ppm=" + ppm +
                '}';
    }
}
