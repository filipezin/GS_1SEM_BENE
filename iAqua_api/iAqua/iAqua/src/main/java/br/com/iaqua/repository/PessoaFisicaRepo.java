package br.com.iaqua.repository;

import br.com.iaqua.model.Cliente.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepo extends JpaRepository<PessoaFisica, Long> {
    PessoaFisica findByEmail(String email);
}
