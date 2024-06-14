package com.simeru.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simeru.entities.Playlist;
import com.simeru.repositories.IPlaylistDAO;

@Service
public class PlaylistServiceImpl implements IPlaylistService {

	@Autowired
	IPlaylistDAO dao;
	//Dio delle città e dell'immensità

	@Override
	public List<Playlist> getPlaylists() {
		return dao.findAll();
	}

	@Override
	public Playlist getPlaylistById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Playlist getPlaylistByNumCanzoni(int tot_canzoni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Playlist getPlaylistByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Playlist addPlaylist(Playlist playlist) {
		return dao.save(playlist);
	}

}
