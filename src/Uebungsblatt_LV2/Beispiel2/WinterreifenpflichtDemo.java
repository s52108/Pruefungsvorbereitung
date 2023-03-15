package Uebungsblatt_LV2.Beispiel2;

public class WinterreifenpflichtDemo {
    public static void main(String[] args) {

        int temperatur1 = 12;
        boolean rutschig1 = false;
        int temperatur2 = 12;
        boolean rutschig2 = true;
        int temperatur3 = 5;
        boolean rutschig3 = true;
        int temperatur4 = 2;
        boolean rutschig4 = false;

winterreifenpflichtAusgabe(isWinterreifenPflicht(temperatur1,rutschig1));
winterreifenpflichtAusgabe(isWinterreifenPflicht(temperatur2,rutschig2));
winterreifenpflichtAusgabe(isWinterreifenPflicht(temperatur3,rutschig3));
winterreifenpflichtAusgabe(isWinterreifenPflicht(temperatur4,rutschig4));



    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        boolean winterrreifenpflicht = false;

        if (temperatur < 10 && rutschigeFahrbahn) {
            winterrreifenpflicht = true;
        } else if (temperatur < 4) {
            winterrreifenpflicht = true;
        }
        return winterrreifenpflicht;
    }

    public static void winterreifenpflichtAusgabe(boolean pflicht){
        if (pflicht){
            System.out.println("Bitte Winterreifen verwenden.");
        } else System.out.println("Winterreifen sind nicht erforderlich");

    }
}
