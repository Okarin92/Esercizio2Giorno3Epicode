package Settimana2Giorno3;

import java.time.LocalDate;

public class Lavoratore extends Persona {
	private String matricolaLavoratore;
	private String azienda;
	private LocalDate dataAssunzione;
	private StatoLavoratore statoLavoratore;
	
	public Lavoratore(String nome, String cognome, String matricolaLavoratore, String azienda,LocalDate dataAssunzione, StatoLavoratore statoLavoratore) {
		super(nome,cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione = dataAssunzione;
		this.statoLavoratore = statoLavoratore;
	}
	public String infoLavoratore() {
		String info = info() + matricolaLavoratore + azienda + dataAssunzione + statoLavoratore;
		return info;
		
	}
	public String getMatricolaLavoratore() {
		return matricolaLavoratore;
	}
	
	public String getAzienda() {
		return azienda;
	}

	public StatoLavoratore getStatoLavoratore() {
		return statoLavoratore;
	}

	public static enum StatoLavoratore {
		IN_ATTIVITA, IN_FERIE, IN_MALATTIA
	}

}
