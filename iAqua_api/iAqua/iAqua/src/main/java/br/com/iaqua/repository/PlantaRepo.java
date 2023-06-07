package br.com.iaqua.repository;

import br.com.iaqua.model.Planta.Fruto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantaRepo extends JpaRepository<Fruto, Long> {
}
