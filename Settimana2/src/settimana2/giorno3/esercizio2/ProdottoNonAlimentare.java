package settimana2.giorno3.esercizio2;

// a quelli Non Alimentari la categoria merceologica, identificata da un nome e un codice.
// Non deve essere possibile istanziare oggetti di tipo prodotto, ma solo prodotti alimentari o non alimentari.
// Realizzare la gerarchia delle classi necessarie ad implementare il suddetto contesto.

public class ProdottoNonAlimentare extends Prodotto {
	
	private CategoriaMerceologica categoriaMerceologica;
	
	public ProdottoNonAlimentare(String codiceUnivoco, String descrizione, double costo, CategoriaMerceologica categoriaMerceologica) {
		super(codiceUnivoco, descrizione, costo);
		this.categoriaMerceologica = categoriaMerceologica;
	}

	public CategoriaMerceologica getCategoriaMerceologica() {
		return categoriaMerceologica;
	}

	@Override
	public void confeziona() {
        		
	}
	
    
}
