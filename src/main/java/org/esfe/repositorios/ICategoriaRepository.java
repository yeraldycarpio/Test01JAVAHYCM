package org.esfe.repositorios;

import org.esfe.modelos.CategoriaHYCM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository <CategoriaHYCM, Integer> {
}
