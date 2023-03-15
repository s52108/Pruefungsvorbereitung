package Uebungsblatt_LV2.Beispiel1;

import Uebungslatt_LV1.Beispiel1.PunkteKleinerNullException;

public class NotenDemo {
    public static void main(String[] args) throws PunkteKleinerNullException {
        int Punkte1 = -1;
        int Punkte2 = 40;
        int Punkte3 = 60;
        int Punkte4 = 70;
        int Punkte5 = 80;
        int Punkte6 = 1000;

        System.out.println(getNotentext(Punkte1));
        System.out.println(getNotentext(Punkte2));
        System.out.println(getNotentext(Punkte3));
        System.out.println(getNotentext(Punkte4));
        System.out.println(getNotentext(Punkte5));
        System.out.println(getNotentext(Punkte6));

    }

    public static String getNotentext(int punkte) throws PunkteKleinerNullException {

        String notenText = "";

        if (punkte < 0) {
            throw new PunkteKleinerNullException(punkte);
        } else if (punkte <= 50) {
            notenText = "Ungenügend";
        } else if (punkte <= 64) {
            notenText = "Genügend";
        } else if (punkte <= 77) {
            notenText = "Befriedigend";
        } else if (punkte <= 89) {
            notenText = "Gut";
        } else {
            notenText = "Sehr gut";
        }
        return notenText;
    }
}
