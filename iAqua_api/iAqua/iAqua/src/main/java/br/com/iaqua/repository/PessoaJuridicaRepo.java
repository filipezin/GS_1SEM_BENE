package br.com.iaqua.repository;

import br.com.iaqua.model.Cliente.PessoaFisica;
import br.com.iaqua.model.Cliente.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaJuridicaRepo extends JpaRepository<PessoaJuridica, Long> {
    PessoaJuridica findByEmail(String email);
}
