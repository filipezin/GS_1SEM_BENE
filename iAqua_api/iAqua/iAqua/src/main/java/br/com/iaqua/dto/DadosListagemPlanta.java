package br.com.iaqua.dto;

import br.com.iaqua.model.Planta.Fruto;
import br.com.iaqua.model.Planta.Nutricao;
import br.com.iaqua.model.Planta.TipoFruto;

public record DadosListagemPlanta(

        // OBRIGATÓRIOS
        Long id,



        //OPCIONAIS
        TipoFruto tipo,
        String nomeFruto,
        String fenotipo,
        Nutricao tabelaNutricional
) {
    public DadosListagemPlanta(Fruto f){
        this(
                f.getId(),
                f.getTipo(),
                f.getNomeFruto(),
                f.getFenotipo(),
                f.getTabelaNutricional()
        );
    }
}
