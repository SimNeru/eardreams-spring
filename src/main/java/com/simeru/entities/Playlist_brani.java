package com.simeru.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "playlist_brani")
public class Playlist_brani {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "id_playlist", referencedColumnName = "playlist(id)")
	private int id_playlist;
	@JoinColumn(name = "id_brani", referencedColumnName = "brani(id)")
	private int id_brani;
	
	@OneToMany(cascade = CascadeType.REFRESH)
    private List<Playlist> playlists;
	
	@OneToMany(cascade = CascadeType.REFRESH)
    private List<Brano> brani;
	
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	public List<Brano> getBrani() {
		return brani;
	}
	public void setBrani(List<Brano> brani) {
		this.brani = brani;
	}
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
