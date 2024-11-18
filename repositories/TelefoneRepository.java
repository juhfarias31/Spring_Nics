package com.nics.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nics.loja.entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}