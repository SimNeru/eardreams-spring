package com.simeru.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simeru.entities.Brano;

@Service
public interface IBranoService {

	List<Brano> getBrani();
	Brano findById(int id);
	Brano findByTitolo(String titolo);
	List<Brano> findByArtista(String artista);
	List<Brano> findByAlbum(String album);
	Brano addBrano(Brano brano);
}
