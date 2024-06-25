package com.eardreams.project.repo;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eardreams.project.entities.Brano;
import com.eardreams.project.entities.Playlist;

public interface IBranoDAO extends JpaRepository<Brano, Integer>{

	Optional<Brano> findById(Integer id);
	List<Brano> findByAlbum(String album);
	List<Brano> findByArtista(String artista);
	List<Brano> findByTitolo(String titolo);

}
