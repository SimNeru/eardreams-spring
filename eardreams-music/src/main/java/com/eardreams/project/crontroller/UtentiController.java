package com.eardreams.project.crontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eardreams.project.entities.Utente;
import com.eardreams.project.service.UtentiService;

@RestController
@RequestMapping("api")
public class UtentiController {
	
	@Autowired
	UtentiService service;
	
	@GetMapping("utenti")
	List<Utente> getAllUtenti()
	{ return service.getUtenti(); }
	
	@GetMapping("utenti/email/{email}")
	List<Utente> getUtentiByEmail(@PathVariable String email)
	{ return service.getByEmail(email);}
	
	@GetMapping("utenti/username/{username}")
	List<Utente> getUtentiByUsername(@PathVariable String username)
	{ return service.getByUsername(username);}
	
	@GetMapping("utenti/id/{id}")
	Optional<Utente> getUtentiById(@PathVariable Integer id)
	{ return service.getById(id);}

	@PostMapping("utenti/register")
	Utente registerUtente(@RequestBody Utente utenti) 
	{return service.addUtente(utenti); }
}
