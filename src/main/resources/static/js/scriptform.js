class Utente{
constructor(nome,cognome,username,email,password){
this.nome=nome;
this.cognome=cognome;
this.username=username;
this.email=email;
this.password=password;
}
}
let elListaCanzoni=document.querySelector("#elListaCanzoni");
let formReg=document.querySelector("#formReg");

const URLEndpoint="./api/utenti/register";

function salvaUtente(){
        let nome=document.querySelector("#nome").value;
        
        let cognome=document.querySelector("#cognome").value;
        
        let username=document.querySelector("#username").value;
        
        let email=document.querySelector("#email").value;
        
        let password=document.querySelector("#password").value;
        

        if( nome==""||cognome==""||username==""||email==""||password==""){
            event.preventDefault();
        }else{
        let utente=new Utente(nome,cognome,username,email,password);
        console.log(utente);
        fetch(URLEndpoint,{
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(utente)
            })
        .then(data =>{
            return data.json();
        })
        .then(()=> {
        localStorage.setItem(utente.username,"activeUser")
        location.reload();
        })

        }
}
formReg.addEventListener("submit",salvaUtente);