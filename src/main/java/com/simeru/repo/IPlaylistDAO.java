package com.eardreams.project.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eardreams.project.entities.Playlist;

public interface IPlaylistDAO extends JpaRepository<Playlist, Integer>{

	Optional<Playlist> findById(Integer id);
	Optional<Playlist> findByNome(String playlistName);
	
}