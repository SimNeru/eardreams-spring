package com.simeru.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simeru.entities.Brano;

@Repository
public interface IBranoDAO extends JpaRepository<Brano, Integer>{

	@Query("select `titolo` from brani b where b.titolo = ?1")
	Brano findByTitolo(String titolo);
	List<Brano> findByArtista(String artista);
	List<Brano> findByAlbum(String album);

}
