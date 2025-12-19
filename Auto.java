public class Auto {
    
    public String marke;
    public String farbe;
    public String kennzeichen;

    public void Auto(String pMarke, String pFarbe, String pKennzeichen){
        marke = pMarke;
        farbe = pFarbe;
        kennzeichen = pKennzeichen;
    }

    public String toString(){
        String fahrzeugTyp = this.getClass().getName();
        return fahrzeugTyp + ": Kennzeichen " + kennzeichen + ", Marke: " + marke + ", Farbe: " + farbe;
    }
    


    
}
