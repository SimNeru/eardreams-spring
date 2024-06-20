package com.eardreams.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eardreams.project.entities.Brano;
import com.eardreams.project.repo.IBranoDAO;

@Service
public class BranoServiceImpl implements BranoService{

	@Autowired
	IBranoDAO dao;
	
	@Override
	public Optional<Brano> getById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Brano> getBrani() {
		return dao.findAll();
	}

	@Override
	public List<Brano> getByTitolo(String titolo) {
		return dao.findByTitolo(titolo);
	}

	@Override
	public List<Brano> getByArtista(String artista) {
		return dao.findByArtista(artista);
	}

	@Override
	public List<Brano> getByAlbum(String album) {
		return dao.findByAlbum(album);
	}

	@Override
	public Brano addBrano(Brano brano) {
		return dao.save(brano);
	}

}
