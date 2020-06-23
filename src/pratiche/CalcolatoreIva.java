package pratiche;

public class CalcolatoreIva implements Calcolatore {

    private int percentuale;
    private int totaleIva;

    public CalcolatoreIva(int percentuale) {
        super();
        this.percentuale = percentuale;
    }

    @Override
    public void processa(Pratica... pratiche) {

        totaleIva = 0;
        for (Pratica pratica : pratiche) {
            pratica.accetta(this);
        }

        System.out.printf("Calcolo iva effettuato su %d pratiche: %n", pratiche.length);
        System.out.printf("- totale iva: %d%n", totaleIva);
        System.out.println();

    }


    public void calcola(PraticaIva pratica) {
        totaleIva += pratica.calcolaIva(percentuale);
    }

    public void visita(PraticaTasse pratica) {
        // niente da fare qui
    }

}
