package com.simeru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simeru.entities.Utente;

public interface IUtenteDAO extends JpaRepository<Utente, Integer>{

}
