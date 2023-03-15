package UebungsblattArrays.Beispiel3;

public class UmsatzDemo_Erweiterung {
    public static void main(String[] args) {
        double umsatz1 = 1000;
        double umsatz2 = 1101;
        double umsatz3 = 1000;
        double umsatz4 = 1500;
        double umsatz5 = 2000;
        double umsatz6 = 1900;
        double umsatz7 = 2500;
        double umsatz8 = 1000;
        double umsatz9 = 900;
        double umsatz10 = 1800;
        double umsatz11 = 2500;
        double umsatz12 = 2000;

        double[] umsaetze = new double[]{umsatz1, umsatz2, umsatz3, umsatz4, umsatz5, umsatz6, umsatz7, umsatz8, umsatz9, umsatz10, umsatz11, umsatz12};

        System.out.println("Im Geschäftsjahr gab es insgesamt " + getUmsatzsteigerungGT10(umsaetze) + " Monate mit 10% Umsatzsteigerung im Vergleich zum Vormonat.");

        //Erweiterung
        double[][] umsaetzeProWoche = new double[][]{{21, 22, 23, 24, 25}, {11, 12, 13, 14, 15}, {31, 32, 33, 34, 35}, {41, 42, 43, 44, 45}};
        double[] wochenSumme = calculateSumByWeek(umsaetzeProWoche);
        for (int i = 0; i < wochenSumme.length; i++) {
            System.out.println("Umsatz der " + (i + 1) + ". Woche = " + wochenSumme[i] + " €");
        }
    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze) {
        int umsatzsteigerung = 0;

        for (int i = 0; i < umsaetze.length - 1; i++) {
            if (umsaetze[i + 1] > umsaetze[i] * 1.1) {
                umsatzsteigerung++;
            }
        }
        return umsatzsteigerung;
    }

    public static double[] calculateSumByWeek(double[][] umsaetze) {
        double[] umsatzProWoche = new double[umsaetze.length];
        for (int i = 0; i < umsaetze.length; i++) {
            for (int j = 0; j < umsaetze[i].length; j++) {
                umsatzProWoche[i] += umsaetze[i][j];
            }

        }
        return umsatzProWoche;

    }
}
