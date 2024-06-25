
let elNomeUtente = document.getElementById('elNomeUtente');
let elCognomeUtente = document.getElementById('elCognomeUtente');
let elGenerePref = document.getElementById('elGenerePref');

let elTitolo = document.getElementById('elTitolo');
let elAlbum = document.getElementById('elAlbum');
let elArtista = document.getElementById('elArtista');


let btnCarica = document.getElementById('btnCarica');
let btnStampaPlaylist = document.getElementById('btnStampaPlaylist');

let feedback = document.getElementById('feedback');

let nomePlaylist = document.getElementById('nomePlaylist');
let elPlaylist = document.getElementById('elPlaylist');
const URLEndpoint="https://6668148df53957909ff66d2e.mockapi.io/api/utenti";
class Utente {
    /**
     * @param {string} nome 
     * @param {string} cognome 
     * @param {string} generePref 
     * @param {Canzone[]} playlist 
     */
    constructor(nome, cognome, generePref, playlist) {
        this.nome = nome;
        this.cognome = cognome;
        this.generePref = generePref;
        this.playlist = playlist;
    }

    aggiungiCanzone(canzone) {
        this.playlist.push(canzone);
    }

    stampaInfo() {
        let infoUtente = `Playlist di ${this.nome} ${this.cognome}`;
        return infoUtente;
    }
}

class Canzone {
    constructor(titolo, album, artista) {
        this.titolo = titolo;
        this.album = album;
        this.artista = artista;
        
    }

    stampaCanzone() {
        let infoCanzone = `<span>${this.titolo}</span> <span>${this.album}</span> <span>${this.artista}</span>`;
        return infoCanzone;
    }
}

let mioUtente;
// console.log(mioUtente);

function creaUtente() {
    let nome = elNomeUtente.value;
    let cognome = elCognomeUtente.value;
    let generePref = elGenerePref.value;

    mioUtente = new Utente(nome, cognome, generePref);
}

function aggiungiCanzone() {
    if (mioUtente == undefined) {
        creaUtente();
    }

    let titolo = elTitolo.value;
    let album = elAlbum.value;
    let artista = elArtista.value;
  

    let nuovaCanzone = new Canzone(titolo, album, artista);
    let utente = new Utente(userName, lastName);

    fetch(URLEndpoint, {
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(nuovaCanzone)
    })
        .then(data => {
            return data.json();
        })
        .then(() => {
            location.reload();
        })

}

function stampaPlaylist() {
    elPlaylist.innerHTML = '';

    let playlist = '';

    mioUtente.playlist.forEach(canzone => {
        playlist += `<li>${canzone.stampaCanzone()}</li>`
    });

    elPlaylist.innerHTML = playlist;

    nomePlaylist.innerHTML = `${mioUtente.stampaInfo()}`;
}

btnCarica.addEventListener('click', aggiungiCanzone);
btnStampaPlaylist.addEventListener('click', stampaPlaylist);

