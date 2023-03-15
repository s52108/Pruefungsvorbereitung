package Uebungsblatt_LV2.Beispiel1;

public class PunkteKleinerNullException extends Exception{
    public PunkteKleinerNullException (int punkte){
        super(">> Fehler << " + punkte + " Punkte sind weniger als 0 Punkte.");
    }
}
