package br.com.iaqua.controller;


import br.com.iaqua.dto.*;
import br.com.iaqua.model.Cliente.PessoaFisica;
import br.com.iaqua.model.Cliente.PessoaJuridica;
import br.com.iaqua.repository.PessoaJuridicaRepo;
import br.com.iaqua.dto.LoginRequest;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/pj")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaRepo repository;


    // ---------------------------- //


    /*
    CADASTRO - POST METHOD
    ENDPOINT: http://localhost:8080/pj
    BODY JSON:
    {
      "nome": "Empresa XYZ",
      "endereco": "Avenida Empresarial, 1234",
      "telefone": "+5511999999999",
      "email": "contato@empresa.xyz",
      "dt_contratacao_servico": "2023-05-31",
      "cnpj": "12.345.678/0001-91"
    }
     */

    @PostMapping("/login")
    public ResponseEntity<PessoaJuridica> login(@RequestBody @Valid LoginRequest request) {
        PessoaJuridica pj = repository.findByEmail(request.getEmail());
        if (pj == null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "E-mail e/ou senha inválidos.");
        }

        boolean senhaValida = pj.validaSenha(request.getSenha()); // vamos supor que validaSenha é um método que verifica a senha
        if (!senhaValida) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "E-mail e/ou senha inválidos.");
        }

        return ResponseEntity.ok(pj.removeSenha());
    }

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroPJ dados){
        PessoaJuridica pj = new PessoaJuridica(dados);
        repository.save(pj);
    }


    // ---------------------------- //


    /*
    FIND BY ID - GET METHOD
    ENDPOINT: http://localhost:8080/pj/id
    EX: http://localhost:8080/pj/1
     */

    @GetMapping("/{id}")
    public DadosListagemPJ findById(@PathVariable Long id){
        PessoaJuridica pj = repository.findById(id).orElse(null);
        if(pj != null){
            return new DadosListagemPJ(pj);
        } else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empresa não encontrada");
        }
    }


    // ---------------------------- //


    /*
    UPDATE - PUT METHOD
    ENDPOINT: http://localhost:8080/pj
    BODY JSON:
    {
      "id": 1,
      "nome": "Empresa XYZ atualizada",
      "endereco": "Avenida Empresarial, 5678",
      "telefone": "+5511888888888",
      "email": "contato@empresa.xyz",
      "dt_contratacao_servico": "2023-06-01",
      "cnpj": "12.345.578/0001-91"
    }
     */

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPJ dados){
        PessoaJuridica pj = new PessoaJuridica();
        pj = repository.getReferenceById(dados.id());
        pj.atualizaCadastro(dados);
    }


    // ---------------------------- //


    /*
    DELETE - DELETE METHOD
    ENDPOINT: http://localhost:8080/pj/id
    EX: http://localhost:8080/pj/1

    ** Tivemos que mudar a forma de deletar cadastros para PJ,
    a forma como fizemos com PF apresentou problemas e não conseguimos
    solucionar. Mas o método presente funciona perfeitamente, apesar de
    diferente **

     */

    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }

}
