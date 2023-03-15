package UebungsblattArrays.Beispiel1;

public class UmsatzDemo {
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
}
