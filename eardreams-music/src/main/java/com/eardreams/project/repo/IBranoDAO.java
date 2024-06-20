package com.eardreams.project.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eardreams.project.entities.Brano;

public interface IBranoDAO extends JpaRepository<Brano, Integer>{

	Optional<Brano> findById(Integer id);
	List<Brano> findByAlbum(String album);
	List<Brano> findByArtista(String artista);
	List<Brano> findByTitolo(String titolo);
	
//	@Query(value = "select artista,titolo as region from countries", nativeQuery = true)
//	List<Brano> findByArtistaAndAlbum();

}
