package br.com.iaqua.model.Rig;

import br.com.iaqua.model.Planta.Nutricao;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "TB_SOCKET")
public class Socket {

    @Id
    @SequenceGenerator(name = "SQ_SOCKET", sequenceName = "SQ_SOCKET")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SOCKET")
    @Column(name = "ID_SOCKET")
    private Long id;

    @Column(name = "SKT_TEMPERATURA")
    private Double temperatura;

    @Column(name = "SKT_PESO")
    private Double pesoAtual;

    @Column(name = "UMIDADE_AR")
    private Double umidadeRelativaAR;

    @Column(name = "SKT_DT_PLANTIO")
    private LocalDate dtPlantio;

    @Column(name = "SKT_DT_COLHEITA")
    private LocalDate dtColheita;





}
