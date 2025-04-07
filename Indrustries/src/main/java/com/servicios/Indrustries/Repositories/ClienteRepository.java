package com.servicios.Indrustries.Repositories;

import com.servicios.Indrustries.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
