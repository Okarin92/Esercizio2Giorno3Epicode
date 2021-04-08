package settimana2.giorno3.esercizio2;
// Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari .
// Ai prodotti Alimentari viene infatti associata una data di scadenza e l'indicazione se è vegano o meno

import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {
	
	private LocalDate dataDiScadenza;
	private boolean vegano;
	
	public ProdottoAlimentare(String codiceUnivoco, String descrizione, double costo, LocalDate dataDiScadenza, boolean vegano) {
		super(codiceUnivoco, descrizione, costo);
        this.dataDiScadenza = dataDiScadenza;
        this.vegano = vegano;
	}
// @... sono annotazioni che vengono lette dal compilatore e poi non vengono lette.
// N1: documentazione del codice
// N2: evita di commettere errori	
	@Override
	public void confeziona() {
		
       		
	}
	
	
	
	

}
