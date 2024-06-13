package com.simeru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simeru.entities.Playlist;

public interface IPlaylistDAO extends JpaRepository<Playlist, Integer>{

}
