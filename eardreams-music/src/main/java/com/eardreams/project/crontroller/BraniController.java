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

import com.eardreams.project.entities.Brano;
import com.eardreams.project.service.BranoService;

@RestController
@RequestMapping("api")
public class BraniController {
	
	@Autowired
	BranoService service;

	@GetMapping("brani")
	List<Brano> getAllBrani()
	{ return service.getBrani(); }
	
	@GetMapping("brani/titolo/{titolo}")
	List<Brano> getBraniByTitolo(@PathVariable String titolo)
	{ return service.getByTitolo(titolo);}
	
	@GetMapping("brani/artista/{artista}")
	List<Brano> getBraniByArtista(@PathVariable String artista)
	{ return service.getByArtista(artista);}
	
	@GetMapping("brani/album/{album}")
	List<Brano> getBraniByAlbum(@PathVariable String album)
	{ return service.getByAlbum(album);}
	
	@GetMapping("brani/id/{id}")
	Optional<Brano> getBraniByAlbum(@PathVariable Integer id)
	{ return service.getById(id);}
	
	@PostMapping("brani/add")
	Brano addBrano(@RequestBody Brano brano)
	{return service.addBrano(brano);}
}
