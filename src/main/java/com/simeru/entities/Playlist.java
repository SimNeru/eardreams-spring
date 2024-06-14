package com.simeru.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "playlist")
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@JoinColumn(name = "id_utente", referencedColumnName = "utenti(id)")
//	private int id_utente;
	private int numero_canzoni;
	private String nome_playlist;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "playlist")
//    private List<Utente> utente;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome_playlist;
	}
	public void setNome(String nome_playlist) {
		this.nome_playlist = nome_playlist;
	}
	public int getNumero_canzoni() {
		return numero_canzoni;
	}
	public void setNumero_canzoni(int numero_canzoni) {
		this.numero_canzoni = numero_canzoni;
	}
//	public int getId_utente() {
//		return id_utente;
//	}
//	public void setId_utente(int id_utente) {
//		this.id_utente = id_utente;
//	}

}
