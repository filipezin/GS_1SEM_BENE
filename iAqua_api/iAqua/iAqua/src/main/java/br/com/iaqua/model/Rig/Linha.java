package br.com.iaqua.model.Rig;

import jakarta.persistence.*;

@Entity
@Table(
        name = "TB_RIG_LINHA",
        uniqueConstraints = @UniqueConstraint(
                name = "UK_ID_LINHA", columnNames = "ID_LINHA"))
public class Linha {

    @Id
    @SequenceGenerator(name = "SQ_RIG_LINHA", sequenceName = "SQ_RIG_LINHA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RIG_LINHA")
    @Column(name = "ID_LINHA")
    private Long id;

    @Column(name = "NR_PLANTAS_RIG")
    private Integer qtdRig;

    @Embedded
    private NutricaoHidroponica nutricaoAtual;

    @Embedded
    private BombaSubmersa bomba;

    @Embedded
    private Medidor medidor;

}
