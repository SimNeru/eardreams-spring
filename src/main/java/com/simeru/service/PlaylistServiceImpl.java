package com.eardreams.project.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eardreams.project.entities.Brano;
import com.eardreams.project.entities.Playlist;
import com.eardreams.project.entities.Utente;
import com.eardreams.project.repo.IBranoDAO;
import com.eardreams.project.repo.IPlaylistDAO;
import com.eardreams.project.repo.UtentiDAO;

@Service
public class PlaylistServiceImpl implements PlaylistService {

	@Autowired
	IPlaylistDAO playlistDAO;

	@Autowired
	IBranoDAO branoDAO;

	@Autowired
	UtentiDAO utentiDAO;

	@Override
	public Optional<Playlist> getById(Integer id) {
		return playlistDAO.findById(id);
	}

	@Override
	public Optional<Playlist> getPlaylistByName(String playlistName) {
		return playlistDAO.findByNome(playlistName);
	}

	@Override
	public Playlist createNewPlaylist(Playlist playlist) {
		return playlistDAO.save(playlist);
	}

	public void createPlaylistForBrano(Playlist playlist, String branoID) {
		// creo una nuova playlist
		Playlist playlistCreata = playlist;

		// salvo la playlist
		playlistCreata = playlistDAO.save(playlistCreata);

		// prendo un brano esistente
		Brano branoFetch = branoDAO.getReferenceById(Integer.valueOf(branoID));

		// creo set della playlist
		Set<Playlist> playlists = new HashSet<Playlist>();
		playlists.add(playlistCreata);

		// assegno il set della Playlist a Brano
		branoFetch.setBraniPlaylist(playlists);
	}

	public void assignPlaylistToBrano(Integer playlistID, Integer branoID) {
		// prendo la playlist con l'id di riferimento
		Playlist playlist = playlistDAO.getReferenceById(playlistID);

		// prendo il brano con l'id di riferimento
		Brano brano = branoDAO.getReferenceById(branoID);

		// creo un Playlist set
		Set<Playlist> setDiPlaylists = new HashSet<>();
		setDiPlaylists.add(playlist);

		// assegno il set della playlist a un brano
		brano.setBraniPlaylist(setDiPlaylists);

		// salvo il brano
		brano = branoDAO.save(brano);

	}

	@Override
	public void createPlaylistForUtente(Playlist playlistIn, String utenteID) {
		
		Utente utenteTemp = utentiDAO.getReferenceById(Integer.valueOf(utenteID));

		List<Playlist> playlists = new ArrayList<>();
		
		Playlist playlist = playlistIn;
		playlist.setUtente(utenteTemp);
		playlists.add(playlist);
		
		utenteTemp.setPlaylists(playlists);
		
		utentiDAO.save(utenteTemp);
	}
}
