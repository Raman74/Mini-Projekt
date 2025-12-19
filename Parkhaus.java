public class Parkhaus {

    public Auto[] stellplaetze;
    public int[] einfahrtzeiten;

    /**
     * Konstruktor für das Parkhaus.
     * Initialisiert die Arrays für die Stellplätze und die Einfahrtzeiten.
     */
    public Parkhaus() {
        this.stellplaetze = new Auto[100];
        this.einfahrtzeiten = new int[100];
    }

    /**
     * Gibt den aktuellen Zustand aller Stellplätze auf der Konsole aus.
     * @param stellplaetze Das Array der Stellplätze.
     */
    public static void ausgabestellplaetze(Auto[] stellplaetze){
            for(int i=0; i<100;i++){
                System.out.println("Stellplatz:" + (i+1) + ":" + stellplaetze[i]);
            }
    }

    /**
     * Zählt die Anzahl der freien Stellplätze.
     * @return Die Anzahl der freien Stellplätze.
     */
    public int freiestellplaetze(){
        int freieStellplaetze = 0;
        for(int i=0; i<100; i++){
            if(stellplaetze[i] == null){
                freieStellplaetze = freieStellplaetze + 1;
            }
        }
        return freieStellplaetze;
    }

    /**
     * Zählt die Anzahl der belegten Stellplätze.
     * @return Die Anzahl der belegten Stellplätze.
     */
    public int belegteStellplaetze(){
        int belegteStellplaetze = 0;
        for(int i=0; i<100; i++){
            if(stellplaetze[i] != null){
                belegteStellplaetze = belegteStellplaetze + 1;
            }
        }
        return belegteStellplaetze;
    }

    /**
     * Parkt ein Fahrzeug auf dem ersten freien Stellplatz.
     * @param auto Das zu parkende Auto.
     * @param einfahrzeit Die Zeit der Einfahrt.
     * @return Der zugewiesene Stellplatz (Index) or -1 wenn kein Platz frei ist.
     */
    public int fahrzeugEinfahren(Auto auto, int einfahrzeit){
        for (int i = 0; i < stellplaetze.length; i++) {
            if (stellplaetze[i] == null) {
                stellplaetze[i] = auto;
                einfahrtzeiten[i] = einfahrzeit;
                return i;
            }
        }
        return -1; // No free spot
    }

    /**
     * Lässt ein Fahrzeug das Parkhaus verlassen.
     * @param kennzeichen Das Kennzeichen des ausfahrenden Fahrzeugs.
     */
    public void fahrzeugAusfahrt(String kennzeichen) {
        for (int i = 0; i < stellplaetze.length; i++) {
            if (stellplaetze[i] != null && stellplaetze[i].kennzeichen.equals(kennzeichen)) {
                stellplaetze[i] = null;
                einfahrtzeiten[i] = 0;
                return;
            }
        }
    }
}