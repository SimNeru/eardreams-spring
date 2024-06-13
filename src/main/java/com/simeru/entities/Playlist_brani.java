package com.simeru.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playlist_brani")
public class Playlist_brani {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int id_playlist;
	private int id_brani;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_playlist() {
		return id_playlist;
	}
	public void setId_playlist(int id_playlist) {
		this.id_playlist = id_playlist;
	}
	public int getId_brani() {
		return id_brani;
	}
	public void setId_brani(int id_brani) {
		this.id_brani = id_brani;
	}
}
