package com.simeru.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simeru.entities.Utente;
import com.simeru.services.IBranoService;
import com.simeru.services.IPlaylistService;
import com.simeru.services.IUtenteService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private IBranoService serviceBrano;
	@Autowired
	private IPlaylistService servicePlaylist;
	@Autowired
	private IUtenteService serviceUtente;
	
	@GetMapping("utenti")
	public List<Utente> getUtenti()
	{
		return serviceUtente.getUtenti();
	}
	
	@GetMapping("utenti/{id}")
	public Utente getUtenteById(@RequestParam int id){
		return serviceUtente.getUtenteById(id);
	}
	
	@PostMapping("utenti")
	public Utente addUtente(@RequestBody Utente utente)
	{
		return serviceUtente.addUtente(utente);
	}
}
