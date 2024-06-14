package com.simeru.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simeru.entities.Brano;
import com.simeru.repositories.IBranoDAO;

@Service
public class BranoServiceImpl implements IBranoService {

	@Autowired
	IBranoDAO dao;

	@Override
	public List<Brano> getBrani() {
		return dao.findAll();
	}

	@Override
	public Brano findById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Brano findByTitolo(String titolo) {
		Brano brano = dao.findByTitolo(titolo);
	    return brano;
	}


	@Override
	public Brano addBrano(Brano brano) {
		return dao.save(brano);
	}

	@Override
	public List<Brano> findByArtista(String artista) {
		List<Brano> braniArtista = dao.findByArtista(artista);
	    return braniArtista;
	}

	@Override
	public List<Brano> findByAlbum(String album) {
		List<Brano> braniAlbum = dao.findByAlbum(album);
	    return braniAlbum;
	}

}
