package com.eardreams.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

import com.eardreams.project.entities.Brano;

public interface BranoService {

	Optional<Brano> getById(Integer id);
	List<Brano> getBrani();
	List<Brano> getByTitolo(String country);
	List<Brano> getByArtista(String capital);
	List<Brano> getByAlbum(String region);
	List<Brano> getBraniMultipleParams(String titolo,String artista,String album);
	Brano addBrano(Brano brano);
	void assignBranoToPlaylist(Integer branoID, Integer playlistID);
	void createBranoForPlaylist(Integer playlistID, String branoID);
	
}
