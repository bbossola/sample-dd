package pratiche;

public class CalcolatoreTasse implements Calcolatore {

    private final int percentualeStandard;
    private final int percentualeLusso;
    
    private int totaleStandard;
    private int totaleLusso;
    
    public CalcolatoreTasse(int percentualeStandard, int percentualeLusso) {
        super();
        this.percentualeStandard = percentualeStandard;
        this.percentualeLusso = percentualeLusso;
    }

    @Override
    public void processa(Pratica... pratiche) {
        totaleStandard = 0;
        totaleLusso = 0;

        for (Pratica pratica : pratiche) {
            pratica.accetta(this);
        }
        
        System.out.printf("Calcolo tasse effettuato su %d pratiche: %n", pratiche.length);
        System.out.printf("- totale tassa standard: %d%n", totaleStandard);
        System.out.printf("- totale tassa di lusso: %d%n", totaleLusso);
        System.out.println();
    }

    public void visita(PraticaTasse pratica) {
        pratica.calcolaTasse(percentualeStandard, percentualeLusso);
        totaleStandard+=pratica.tassaStandard();
        totaleLusso+=pratica.tassaLusso();
    }
    
    public void calcola(PraticaIva pratica ) {
        // niente da fare qui
    }

}
