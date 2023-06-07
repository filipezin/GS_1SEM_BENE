package br.com.iaqua.controller;


import br.com.iaqua.dto.DadosAtualizacaoPF;
import br.com.iaqua.dto.DadosCadastroPF;
import br.com.iaqua.dto.DadosListagemPF;
import br.com.iaqua.dto.LoginRequest;
import br.com.iaqua.model.Cliente.PessoaFisica;
import br.com.iaqua.repository.PessoaFisicaRepo;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/pf")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepo repository;


    // ---------------------------- //


    /*
    CADASTRO - POST METHOD
    ENDPOINT: http://localhost:8080/pf
    BODY JSON:
    {
      "nome": "João",
      "endereco": "Rua dos Bobos, 0",
      "telefone": "+5511999999999",
      "email": "joao@example.com",
      "dt_contratacao_servico": "2023-05-31",
      "cpf": "123.456.789-00",
      "dt_nascimento": "1990-01-01",
      "sexo": "MASCULINO",
      "estado_civil": "CASADO",
      "filhos": 2,
      "renda_media": 5000.0,
      "renda_per_capita": 2500.0
    }
    */

    @PostMapping("/login")
    public ResponseEntity<PessoaFisica> login(@RequestBody @Valid LoginRequest request) {
        PessoaFisica pf = repository.findByEmail(request.getEmail());
        if (pf == null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "E-mail e/ou senha inválidos.");
        }

        boolean senhaValida = pf.validaSenha(request.getSenha()); // vamos supor que validaSenha é um método que verifica a senha
        if (!senhaValida) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "E-mail e/ou senha inválidos.");
        }

        return ResponseEntity.ok(pf.removeSenha());
    }

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroPF dados){
        PessoaFisica pf = new PessoaFisica(dados);
        repository.save(pf);
    }


    // ---------------------------- //


    /*
    FIND BY ID - GET METHOD
    ENDPOINT: http://localhost:8080/pf/id
    EX: http://localhost:8080/pf/1
     */

    @GetMapping("/{id}")
    public DadosListagemPF findById(@PathVariable Long id){
        PessoaFisica pf = repository.findById(id).orElse(null);
        if(pf != null){
            return new DadosListagemPF(pf);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado");
        }
    }


    // ---------------------------- //


    /*
    UPDATE - PUT METHOD
    ENDPOINT: http://localhost:8080/pf
    BODY JSON:
    {
      "id": 1,
      "nome": "João Atualizado",
      "endereco": "Rua dos Bobos, 0",
      "telefone": "+5511999999999",
      "email": "joao.atualizado@example.com",
      "dt_contratacao_servico": "2023-05-31",
      "cpf": "123.456.79-00",
      "dt_nascimento": "1990-01-01",
      "sexo": "MASCULINO",
      "estado_civil": "CASADO",
      "filhos": 2,
      "renda_media": 6000.0,
      "renda_per_capita": 3000.0
    }
     */

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPF dados){
        PessoaFisica pf = new PessoaFisica();
        pf = repository.getReferenceById(dados.id());
        pf.atualizaCadastro(dados);
    }


    // ---------------------------- //


    /*
    DELETE - DELETE METHOD
    ENDPOINT: http://localhost:8080/pf
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
