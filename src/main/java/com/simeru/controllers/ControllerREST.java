package com.simeru.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simeru.entities.Brano;
import com.simeru.services.IBranoService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private IBranoService serviceBrano;
//	@Autowired
//	private IPlaylistService servicePlaylist;
//	@Autowired
//	private IUtenteService serviceUtente;
//
//	@GetMapping("utenti")
//	public List<Utente> getUtenti()
//	{
//		return serviceUtente.getUtenti();
//	}
//
//	@GetMapping("utenti/{id}")
//	public Utente getUtenteById(@RequestParam int id){
//		return serviceUtente.getUtenteById(id);
//	}
//
//	@PostMapping("utenti")
//	public Utente addUtente(@RequestBody Utente utente)
//	{
//		return serviceUtente.addUtente(utente);
//	}

	@GetMapping("brano")
	public List<Brano> getUtenti()
	{
		return serviceBrano.getBrani();
	}

	@GetMapping("brano/id={id}")
	public Brano findById(@RequestParam int id){
		return serviceBrano.findById(id);
	}

	@GetMapping("brano/{titolo}")
	public Brano findByTitolo(@RequestParam String titolo){
		return serviceBrano.findByTitolo(titolo);
	}
	
	@GetMapping("brano/{artista}")
	public List<Brano> findByArtista(@RequestParam String artista){
		return serviceBrano.findByArtista(artista);
	}
	
	@GetMapping("brano/{album}")
	public List<Brano> findByAlbum(@RequestParam String album){
		return serviceBrano.findByAlbum(album);
	}

	@PostMapping("brano")
	public Brano addBrano(@RequestBody Brano brano)
	{
		return serviceBrano.addBrano(brano);
	}
}
