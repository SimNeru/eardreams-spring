package com.simeru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simeru.entities.Playlist;

@Repository
public interface IPlaylistDAO extends JpaRepository<Playlist, Integer>{

}
