package Settimana2Giorno3;

//Gerarchia di persone
//Definire una classe Java che rappresenta una persona.
//La classe Persona deve possedere i seguenti campi:
//-	nome (stringa)
//-	cognome (stringa)
//Inoltre, mette a disposizione un metodo info per ritornare una stringa che riporta il nome e il cognome.
//Definire  poi due classi che rappresentano rispettivamente studenti e lavoratori.
public class Persona {
	
	protected String nome;
	protected String cognome;
	
	public String info() {
		String info = nome + " " + cognome;
		return info;
	}
	
	public Persona (String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		
	}

}
