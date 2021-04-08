package settimana2.giorno3.esercizio2;
//Il gestore di un negozio associa a tutti i suoi Prodotti un codice univoco, una descrizione sintetica del prodotto e il suo prezzo unitario. 
//Realizzare una classe Prodotti con le opportune variabili d'istanza e metodi get e set.
//
//Aggiungere alla classe Prodotti un metodo applicaSconto che modifica il prezzo del prodotto diminuendolo del 5%.
//
//Aggiungere alla classe Prodotti un metodo datiProdotto() che ritorna una stringa con i dati del prodotto.
// una classe astatta non puo essere istanziata. serve solo come madre per altre classi, non per creare oggetti. una classe astratta ha uno o piu metodi astratti.
//un metodo astratto e un metodo che e marcato dalla parola abstract e non ha implementazione.
public abstract class Prodotto {
	
	protected String codiceUnivoco;
	protected String descrizione;
	protected double costo;
	
	public Prodotto(String codiceUnivoco, String descrizione, double costo) {
		this.codiceUnivoco = codiceUnivoco;
		this.descrizione = descrizione;
		this.costo = costo;
	}
// le figlie delle classi astratte devono assolutamente implementare i metodi astratti della classe madre.	
	public abstract void confeziona();
	
	public void applicaSconto() {
		costo -= 0.05*costo;
	}
	public String datiProdotto() {
		String dati = codiceUnivoco + " " + descrizione + " " + costo;
		return dati;
	}
	
	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	

}
