package Settimana2Giorno3;

public class Studente extends Persona{
	private int matricolaStudente;
	private String corsoDiLaurea;
	private StatoStudente statoStudente;
	
	
	public Studente(String nome,String cognome,int matricolaStudente, String corsoDiLaurea, StatoStudente statoStudente) {
		super(nome,cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = corsoDiLaurea;
		this.statoStudente = statoStudente;
		
	}
	public static enum StatoStudente {
		IN_CORSO, FUORI_CORSO, LAUREATO, INTERROTTO
	}	
	
	public int getMatricolaStudente() {
		return matricolaStudente;
	}
	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}
	public StatoStudente getStatoStudente() {
		return statoStudente;
	}
	public String infoStudente() {
		String infoStudente = nome + " " + cognome + " " + matricolaStudente + " " + corsoDiLaurea + " " + statoStudente;
		return infoStudente;
	//	String infoStudente = info() + matricolaStudente + " " + corsoDiLaurea + " " + statoStudente);
	}

}
