package pratiche;

public interface Pratica {

    public String nome()
    ;

    public void stampa()
    ;

    public void accetta(CalcolatoreIva calcolatore);
    ;

    public void accetta(CalcolatoreTasse calcolatore);
    ;
}
