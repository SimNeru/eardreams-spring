package com.simeru.services;

import java.util.List;

import com.simeru.entities.Playlist;

public interface IPlaylistService {

	List<Playlist> getPlaylists();
	Playlist getPlaylistById(int id);
	Playlist getPlaylistByNumCanzoni(int tot_canzoni);
	Playlist getPlaylistByNome(String nome);
	Playlist addPlaylist(Playlist playlist);
}
