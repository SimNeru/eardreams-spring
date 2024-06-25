package com.eardreams.project.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.eardreams.project.entities.Brano;
import com.eardreams.project.entities.Playlist;
import com.eardreams.project.repo.IBranoDAO;
import com.eardreams.project.repo.IPlaylistDAO;

@Service
public class BranoServiceImpl implements BranoService{

	@Autowired
	IBranoDAO branoDAO;
	
	@Autowired
	IPlaylistDAO playlistDAO;
	
	@Override
	public Optional<Brano> getById(Integer id) {
		return branoDAO.findById(id);
	}

	@Override
	public List<Brano> getBrani() {
		return branoDAO.findAll();
	}
	
	@Override
	public List<Brano> getBraniMultipleParams(String titolo,String artista,String album)
	{
		List<Brano> listaBraniDaFiltrare = getBrani();
		List<Brano> listaBraniFiltrati = new ArrayList<>();
		
		for (Brano brano : listaBraniDaFiltrare) {
			if(
					(brano.getTitolo().contains(titolo) || titolo.equals(null)) &&
					(brano.getArtista().contains(artista) || artista.equals(null)) &&
					(brano.getAlbum().contains(album) || album.equals(null)))
			{
				listaBraniFiltrati.add(brano);
			}
		}
		return listaBraniFiltrati;
	}

	@Override
	public List<Brano> getByTitolo(String titolo) {
		return branoDAO.findByTitolo(titolo);
	}

	@Override
	public List<Brano> getByArtista(String artista) {
		return branoDAO.findByArtista(artista);
	}

	@Override
	public List<Brano> getByAlbum(String album) {
		return branoDAO.findByAlbum(album);
	}

	@Override
	public Brano addBrano(Brano brano) 
	{
		return branoDAO.save(brano);
	}
	
	public void createBranoForPlaylist(Integer playlistID, String branoID) 
	{
		// fetcho la playlist
		Playlist playlistFetchata = playlistDAO.getReferenceById(playlistID);
		
		// fetcho il brano
		Brano branoFetch = branoDAO.getReferenceById(Integer.valueOf(branoID));
		
		// creo set della playlist
		Set<Playlist> playlists = new HashSet<>();
		playlists.add(playlistFetchata);
		
		// assegno il set della Playlist a Brano
		branoFetch.setBraniPlaylist(playlists);
		
		// salvo il brano
		branoFetch = branoDAO.save(branoFetch);
		
	}
	
	public void assignBranoToPlaylist(Integer branoID, Integer playlistID) 
	{
		// prendo il brano con l'id di riferimento
		Brano brano = branoDAO.getById(branoID);
		
		// prendo la playlist con l'id di riferimento
		Playlist playlist = playlistDAO.getReferenceById(branoID);
		
		// creo un Playlist set
		Set<Playlist> setDiPlaylists = new HashSet<>();
		setDiPlaylists.add(playlist);
		
		// assegno il set della playlist a un brano
		brano.setBraniPlaylist(setDiPlaylists);
		
		// salvo il brano
		brano = branoDAO.save(brano);
	}
}
