package com.eardreams.project.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eardreams.project.entities.Utente;

public interface UtentiDAO extends JpaRepository<Utente, Integer>{
	
	Optional<Utente> findById(Integer id);
	List<Utente> findByEmail(String email);
	List<Utente> findByPassword(String password);
	List<Utente> findByUsername(String username);

}
