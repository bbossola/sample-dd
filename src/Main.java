import pratiche.*;

public class Main {

    public static void main(String args[]) {
        Pratica[] pratiche = new Pratica[]{
            new PraticaIva("alfa", 100),
            new PraticaIva("beta", 200),
            new PraticaTasse("2010", 1000),
            new PraticaTasse("2011", 1200),
            new PraticaTasse("2012", 1400),
            new PraticaIva("tera", 300),
        };
        
        System.out.printf("Totale di %d pratiche:%n", pratiche.length);
        for (Pratica pratica : pratiche) {
            pratica.stampa();
        }
        System.out.println();
        
        calcola(new CalcolatoreIva(10), pratiche);
        calcola(new CalcolatoreTasse(20, 50), pratiche);
        
    }

    private static void calcola(Calcolatore calcolatore, Pratica[] pratiche) {
        calcolatore.processa(pratiche);
    }
}
