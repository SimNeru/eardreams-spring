package com.eardreams.project.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "playlist")
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playlist_id;
	private int numero_canzoni;
	private String nome;
	
	@ManyToMany(mappedBy = "braniPlaylist")
	private Set<Brano> playlistBrani;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="utente_id")
	private Utente utente;
	
	public int getId() {
		return playlist_id;
	}
	public void setId(int id) {
		this.playlist_id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero_canzoni() {
		return numero_canzoni;
	}
	public void setNumero_canzoni(int numero_canzoni) {
		this.numero_canzoni = numero_canzoni;
	}
	public Set<Brano> getPlaylistBrani() {
		return playlistBrani;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public void setPlaylistBrani(Set<Brano> playlistBrani) {
		this.playlistBrani = playlistBrani;
	}
}
