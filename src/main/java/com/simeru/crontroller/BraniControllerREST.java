package com.eardreams.project.crontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eardreams.project.entities.Brano;
import com.eardreams.project.service.BranoService;

@RestController
@RequestMapping("api")
public class BraniControllerREST {
	
	@Autowired
	BranoService service;

	@GetMapping("brani")
	List<Brano> getAllBrani()
	{ return service.getBrani(); }
	
	@GetMapping("brani/getSong")
	@ResponseBody
	List<Brano> getBraniMulipleParams(@RequestParam String titolo, @RequestParam String artista, @RequestParam String album)
	{return service.getBraniMultipleParams(titolo, artista, album);}
	
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
	{ return service.addBrano(brano);}
	
	@PostMapping("brani/createBranoforPlaylist/{playlistID}/{branoID}")
	public void createBranoforPlaylist(@PathVariable(name = "playlistID") Integer playlistID,@PathVariable(name = "branoID") String branoID)
	{
		service.createBranoForPlaylist(playlistID, branoID);
	}
	
	@PostMapping("brani/assignBranoToPlaylist/{branoID}/{playlistID}")
	public void assignBranoToPlaylist(@PathVariable(name = "branoID") Integer branoID,
			@PathVariable(name = "playlistID") Integer playlistID) 
	{
		service.assignBranoToPlaylist(branoID, playlistID); 
	}
}
