package com.simeru.services;

import java.util.List;

import com.simeru.entities.Utente;

public interface IUtenteService {
	
	List<Utente> getUtenti();
	Utente getUtenteById(int id);
	Utente getUtenteByUsername(String username);
	Utente getUtenteByEmail(String email);
	Utente addUtente(Utente utente);

}
