package org.esfe.Repository;

import org.esfe.Modelos.ClienteHYCM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<ClienteHYCM, Long> {
}
