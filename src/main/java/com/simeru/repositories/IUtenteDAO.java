package com.simeru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simeru.entities.Utente;

@Repository
public interface IUtenteDAO extends JpaRepository<Utente, Integer>{

}
