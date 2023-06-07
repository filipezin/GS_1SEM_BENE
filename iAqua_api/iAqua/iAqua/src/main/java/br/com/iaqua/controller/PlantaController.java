package br.com.iaqua.controller;

import br.com.iaqua.dto.DadosAtualizacaoPlanta;
import br.com.iaqua.dto.DadosCadastroPlanta;
import br.com.iaqua.dto.DadosListagemPlanta;
import br.com.iaqua.model.Planta.Fruto;
import br.com.iaqua.repository.PlantaRepo;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/planta")
public class PlantaController {

    @Autowired
    private PlantaRepo repository;


    // ---------------------------- //


    /*
    CADASTRO - POST METHOD
    ENDPOINT: http://localhost:8080/planta

    ** VALORES HIPOTÉTICOS **
    BODY JSON:
        {
        "tipo": "FRUTA",
        "nome_fruto": "Maçã",
        "fenotipo": "Maçãa Vermelha",
        "tabela_nutricional": {
            "porcao": 100.0,
            "proteina": 0.9,
            "carboidrato": 10.76,
            "gordura": {
                "saturada": 0.041,
                "monoinsaturada": 0.043,
                "poliinsaturada": 0.121
            },
            "kcal": 19.0
        }
    }
     */

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody DadosCadastroPlanta dados){
        Fruto f = new Fruto(dados);
        repository.save(f);
    }


    // ---------------------------- //


    /*
    FIND BY ID - GET METHOD
    ENDPOINT: http://localhost:8080/planta/id
    EX: http://localhost:8080/planta/1
     */

    @GetMapping("/{id}")
    public DadosListagemPlanta findById(@PathVariable Long id){
        Fruto f = repository.findById(id).orElse(null);
        if(f != null){
            return new DadosListagemPlanta(f);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planta não encontrada");
        }
    }

    // Método para retornar todas as plantas

    @GetMapping
    public List<DadosListagemPlanta> findAll(){
        List<Fruto> frutos = repository.findAll();
        return frutos.stream()
                .map(DadosListagemPlanta::new)
                .collect(Collectors.toList());
    }



    // ---------------------------- //


    /*
    UPDATE - PUT METHOD
    ENDPOINT: http://localhost:8080/planta
    BODY JSON:
    {
	"id": 1,
	"tipo": "VERDURA",
	"nome_fruto": "Espinafre",
	"fenotipo": "Espinafre verde",
	"tabela_nutricional": {
		"porcao": 30.0,
		"proteina": 2.9,
		"carboidrato": 3.6,
		"gordura": {
			"saturada": 0.07,
			"monoinsaturada": 0.01,
			"poliinsaturada": 0.17
		    },
		"kcal": 23.0
	    }
    }

     */

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPlanta dados){
        Fruto f = new Fruto();
        f = repository.getReferenceById(dados.id());
        f.atualizaCadastro(dados);
    }


    // ---------------------------- //


    /*
    DELETE - DELETE METHOD
    ENDPOINT: http://localhost:8080/planta
    BODY JSON:
    {
        "id" : 1
    }
     */

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
