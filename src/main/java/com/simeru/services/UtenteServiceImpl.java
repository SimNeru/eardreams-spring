package com.simeru.services;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simeru.entities.Utente;
import com.simeru.repositories.IUtenteDAO;
//import com.simeru.services.IUtenteService;

@Service
public class UtenteServiceImpl implements IUtenteService {

//	@Autowired
	IUtenteDAO dao;
	
	@Override
	public List<Utente> getUtenti() {
		return dao.findAll();
	}

	@Override
	public Utente getUtenteById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Utente getUtenteByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utente getUtenteByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utente addUtente(Utente utente) {
		return dao.save(utente);
	}

}
