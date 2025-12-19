public class ProgrammStart {
    public static void main(String[] args) {
        System.out.println("Prakhaus Programm");
        
        Auto meinbmw = new Auto();
        meinbmw.farbe = "Schwarz";
        meinbmw.marke = "BMW";
        meinbmw.kennzeichen = "K-KK 123";
        Auto [] stellplaetze = new Auto[100];

        for(int i=0; i<100;i++){
            System.out.println("Stellplatz:" + (i+1) + ":" + stellplaetze[i]);

        }
        stellplaetze[0] = meinbmw;

        for(int i=0; i<100;i++){
            System.out.println("Stellplatz:" + (i+1) + ":" + stellplaetze[i]);

        }



        
    }
}