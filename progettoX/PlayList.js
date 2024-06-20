let elNome = document.getElementById('elNome');
let elTitolo = document.getElementById('elTitolo');
let elArtista = document.getElementById('elArtista');


let btnCarica = document.getElementById('btnCarica');
let btnStampaPlaylist = document.getElementById('btnStampaPlaylist');

let feedback = document.getElementById('feedback');

let nomePlaylist = document.getElementById('nomePlaylist');
let elPlaylist = document.getElementById('elPlaylist');



class Utente {
    /**
     * @param {string} nome
     * @param {Canzone[]} playlist 
     */
    constructor(nome, playlist) {
        this.nome = nome;
        this.playlist = playlist;
    }

    aggiungiCanzone(canzone) {
        this.playlist.push(canzone);
    }

    stampaInfo() {
        let infoUtente = `Playlist di ${this.nome} `;
        return infoUtente;
    }
}

class Canzone {
    constructor(titolo, artista) {
        this.titolo = titolo;
        this.artista = artista;
    
    }

    stampaCanzone() {
        let infoCanzone = `<span>${this.titolo}</span>  <span>${this.artista}</span>`;
        return infoCanzone;
    }
}

let mioUtente;


function creaUtente() {
    let nome = elNomeUtente.value;

    mioUtente = new Utente(nome, []);
}

function aggiungiCanzone() {
    if (mioUtente == undefined) {
        creaUtente();
    }

    let titolo = elTitolo.value;
    let artista = elArtista.value;
    

    let nuovaCanzone = new Canzone(titolo, artista);

    mioUtente.aggiungiCanzone(nuovaCanzone);

    elTitolo.value = '';
    elArtista.value = '';


    console.log(mioUtente);
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

