package com.simeru.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simeru.entities.Playlist;

@Service
public interface IPlaylistService {

	List<Playlist> getPlaylists();
	Playlist getPlaylistById(int id);
	Playlist getPlaylistByNumCanzoni(int tot_canzoni);
	Playlist getPlaylistByNome(String nome);
	Playlist addPlaylist(Playlist playlist);
}
