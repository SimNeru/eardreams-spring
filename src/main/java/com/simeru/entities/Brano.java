package com.eardreams.project.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "brani")
public class Brano {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brano_id;
	private String titolo;
	private String artista;
	private String album;
	
	@ManyToMany
	@JoinTable(
	name = "brano_Playlist", 
	joinColumns = @JoinColumn(name = "brano_id"),
	inverseJoinColumns = @JoinColumn(name = "playlist_id"))
	private Set<Playlist> braniPlaylist;
	
	public int getId() {
		return brano_id;
	}
	public void setId(int id) {
		this.brano_id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public Set<Playlist> getBraniPlaylist() {
		return braniPlaylist;
	}
	public void setBraniPlaylist(Set<Playlist> braniPlaylist) {
		this.braniPlaylist = braniPlaylist;
	}

	
}