package com.eardreams.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eardreams.project.entities.Utente;
import com.eardreams.project.repo.UtentiDAO;

@Service
public class UtentiServiceImpl implements UtentiService{
	
	@Autowired
	UtentiDAO dao;

	@Override
	public Optional<Utente> getById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Utente> getUtenti() {
		return dao.findAll();
	}

	@Override
	public List<Utente> getByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public List<Utente> getByUsername(String username) {
		return dao.findByUsername(username);
	}

	@Override
	public Utente addUtente(Utente utente) {
		return dao.save(utente);
	}

}
