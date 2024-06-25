package com.eardreams.project.service;

import java.util.List;
import java.util.Optional;

import com.eardreams.project.entities.Playlist;
import com.eardreams.project.entities.Utente;

public interface UtentiService {
	
	Optional<Utente> getById(Integer id);
	List<Utente> getUtenti();
	List<Utente> getByEmail(String email);
	List<Utente> getByUsername(String username);
	Utente addUtente(Utente utenti);
	
}
