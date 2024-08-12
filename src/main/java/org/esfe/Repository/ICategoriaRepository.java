package org.esfe.Repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.esfe.Modelos.CategoriaHYCM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<CategoriaHYCM, Integer> {

}
