public class ProgrammStart {
    public static void main(String[] args) {
        System.out.println("Prakhaus Programm");

        Parkhaus parkhaus = new Parkhaus();

        Parkhaus.ausgabestellplaetze(parkhaus.stellplaetze);
        
        Pkw meinbmw = new Pkw();
        meinbmw.farbe = "Schwarz";
        meinbmw.marke = "BMW";
        meinbmw.kennzeichen = "K-KK 123";

        Pkw meinford = new Pkw();
        meinford.farbe = "Blau";
        meinford.marke = "Ford";
        meinford.kennzeichen = "K-FD 456";

        Lkw meinlkw = new Lkw();
        meinlkw.farbe = "Gelb";
        meinlkw.marke = "MAN";
        meinlkw.kennzeichen = "K-MN 789";

        System.out.println("intiale Belegung frei" + parkhaus.freiestellplaetze());
        System.out.println("intiale Belegung belegt" + parkhaus.belegteStellplaetze());

        parkhaus.fahrzeugEinfahren(meinbmw, 1000);
        parkhaus.fahrzeugEinfahren(meinford, 1010);
        parkhaus.fahrzeugEinfahren(meinlkw, 1020);

        Parkhaus.ausgabestellplaetze(parkhaus.stellplaetze);

        //Zählen freier Stellplätze in Array

        
        System.out.println("Akteulle Anzahl freier Stellplätze:" + parkhaus.freiestellplaetze());
        System.out.println("Anzahl belegter Stellplätze:" + parkhaus.belegteStellplaetze());

        // Simulation: BMW verlässt das Parkhaus
        parkhaus.fahrzeugAusfahrt("K-KK 123");
        System.out.println("Nach dem BMW weg ist:");
        Parkhaus.ausgabestellplaetze(parkhaus.stellplaetze);
        System.out.println("Akteulle Anzahl freier Stellplätze:" + parkhaus.freiestellplaetze());
        System.out.println("Anzahl belegter Stellplätze:" + parkhaus.belegteStellplaetze());
    }
}

       
    