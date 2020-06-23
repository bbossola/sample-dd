package pratiche;

public class PraticaIva implements Pratica {

    private final String nome;
    private final int prezzo;

    public PraticaIva(String nome, int prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    @Override
    public String nome() {
        return nome;
    }

    public int prezzo() {
        return prezzo;
    }
    
    @Override
    public void stampa() {
        System.out.printf("IVA-%s, prezzo %d %n", nome, prezzo);
    }

    public int calcolaIva(int percentuale) {
        return prezzo*percentuale/100;
    }

    @Override
    public void accetta(CalcolatoreIva calcolatore) {
        calcolatore.calcola(this);
    }

    @Override
    public void accetta(CalcolatoreTasse calcolatore) {
        calcolatore.calcola(this);
        
    }

}
