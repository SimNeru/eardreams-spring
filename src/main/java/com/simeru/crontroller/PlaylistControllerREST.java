package com.eardreams.project.crontroller;

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

import com.eardreams.project.entities.Playlist;
import com.eardreams.project.service.PlaylistService;

@RestController
@RequestMapping("api")
public class PlaylistControllerREST {

	@Autowired
	PlaylistService service;

	@PostMapping("playlist/create")
	public Playlist createNewPlaylist(@RequestBody Playlist playlist) {
		return service.createNewPlaylist(playlist);
	}

	@GetMapping("playlist/name")
	@ResponseBody
	Optional<Playlist> getPlaylistByName(@RequestParam String nome) {
		return service.getPlaylistByName(nome);
	}

	@PostMapping("playlist/createPlaylistForBrano/{branoID}")
	public void createPlaylistForBrano(@RequestBody Playlist playlist, @PathVariable(name = "branoID") String branoID) {
		service.createPlaylistForBrano(playlist, branoID);
	}

	@PostMapping("playlist/assignPlaylistToBrano/{playlistID}/{branoID}")
	public void assignPlaylistToBrano(@PathVariable(name = "playlistID") Integer playlistID,
			@PathVariable(name = "branoID") Integer branoID) {
		service.assignPlaylistToBrano(playlistID, branoID);
	}

	@PostMapping("playlist/createPlaylistForUtente/{utenteID}")
	@ResponseBody
	public void createPlaylistForUtente(@RequestBody Playlist playlist, @PathVariable(name = "utenteID") String utenteID) {
		service.createPlaylistForUtente(playlist, utenteID);
	}

}
