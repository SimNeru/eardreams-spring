package com.eardreams.project.service;

import java.util.Optional;

import com.eardreams.project.entities.Playlist;

public interface PlaylistService {

	Optional<Playlist> getById(Integer id);
	Optional<Playlist> getPlaylistByName(String playlistName);
	Playlist createNewPlaylist(Playlist playlist);
	void assignPlaylistToBrano(Integer branoID, Integer playList);
	void createPlaylistForBrano(Playlist playlist, String branoID);
	void createPlaylistForUtente(Playlist playlist, String utenteID);
}
