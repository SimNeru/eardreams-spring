package com.simeru.services;

import java.util.List;

import com.simeru.entities.Brano;

public interface IBranoService {

	List<Brano> getBrano();
	Brano getBranoById(int id);
	Brano getBranoByTitolo(String titolo);
	Brano getBranoByArtista(String artista);
	List<Brano> getBranoByAlbum(String album);
	Brano addBrano(Brano brano);
}
