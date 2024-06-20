package com.eardreams.project.service;

import java.util.List;
import java.util.Optional;

import com.eardreams.project.entities.Brano;

public interface BranoService {

	Optional<Brano> getById(Integer id);
	List<Brano> getBrani();
	List<Brano> getByTitolo(String country);
	List<Brano> getByArtista(String capital);
	List<Brano> getByAlbum(String region);
	Brano addBrano(Brano brano);
}
