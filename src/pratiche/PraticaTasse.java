package pratiche;

public class PraticaTasse implements Pratica {

    private final String nome;
    private final int totale;
    
    private int tassaStandard;
    private int tassaLusso;

    public PraticaTasse(String nome, int totale) {
        this.nome = nome;
        this.totale = totale;
    }
 
    @Override
    public String nome() {
        return nome;
    }

    public int tassaStandard() {
        return tassaStandard;
    }

    public int tassaLusso() {
        return tassaLusso;
    }

    @Override
    public void stampa() {
        System.out.printf("TAX-%s, totale %d %n", nome, totale);
    }

    public void calcolaTasse(int percentualeStandard, int percentualeLusso) {
        int totaleLusso = (totale > 1000) ? totale-1000 : 0;
        this.tassaLusso = totaleLusso*percentualeLusso/100;

        int totaleStandard = totale - totaleLusso;
        this.tassaStandard = totaleStandard*percentualeStandard/100;
    }

    @Override
    public void accetta(CalcolatoreIva calcolatore) {
        calcolatore.visita(this);
    }

    @Override
    public void accetta(CalcolatoreTasse calcolatore) {
        calcolatore.visita(this);
    }
}
