package com.simeru.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simeru.entities.Brano;
import com.simeru.repositories.IBranoDAO;
import com.simeru.services.IBranoService;

@Service
public class BranoServiceImpl implements IBranoService {

	@Autowired
	IBranoDAO dao;
	
	@Override
	public List<Brano> getBrano() {
		return dao.findAll();
	}

	@Override
	public Brano getBranoById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Brano getBranoByTitolo(String titolo) {
		return null;
	}

	@Override
	public Brano getBranoByArtista(String artista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brano> getBranoByAlbum(String album) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brano addBrano(Brano brano) {
		return dao.save(brano);
	}

}
