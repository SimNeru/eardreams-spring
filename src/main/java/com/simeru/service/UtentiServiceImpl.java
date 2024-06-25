package com.eardreams.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eardreams.project.entities.Playlist;
import com.eardreams.project.entities.Utente;
import com.eardreams.project.repo.UtentiDAO;

@Service
public class UtentiServiceImpl implements UtentiService {

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

	// Metodo che crea un user se non è già presente una mail o un username nel database
	@Override
	public Utente addUtente(Utente utente) {

		if (dao.findByEmail(utente.getEmail()).isEmpty()) {
			if (dao.findByUsername(utente.getUsername()).isEmpty()) {
				
//				Utente utenteIn = new Utente();
//				utenteIn.setNome(utente.getNome());
//				utenteIn.setCognome(utente.getCognome());
//				utenteIn.setUsername(utente.getUsername());
//				utenteIn.setEmail(utente.getEmail());
//				utenteIn.setPassword(utente.getPassword());
				
//				List<Playlist> playlists = new ArrayList<Playlist>();
//				for (Playlist playlistIn : utente.getPlaylists()) {
//					Playlist playlist = new Playlist();
//					playlistIn.getNome();
//					playlistIn.getNumero_canzoni();
//					playlistIn.setUtente(utente);
//					
//					playlists.add(playlist);
//				}
//				
//				utenteIn.setPlaylists(playlists);
				
				return dao.save(utente);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
