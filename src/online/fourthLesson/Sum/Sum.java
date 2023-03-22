package online.fourthLesson.Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    private static List<String> numbers = new ArrayList<>();

    public static void main(String[] args) {

        int start = 5;
        int end = 9;

        System.out.println("sumUpBetweenRecursive(start, end) = " + sumUpBetweenRecursive(start, end));
        System.out.println("sumDownBetweenRecursive(start, end) = " + sumDownBetweenRecursive(start, end));


    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        // !!!! Abbruchsbestimmung
        if (n <= 0) {
            return acc;
        }
        acc = acc + n; // Summiere und merke dir die Summe
        return sumUpRecursiveAcc(n - 1, acc);
    }

    public static int sumUpRecursive(int n) {
        System.out.println(n + " + ");
        numbers.add(String.valueOf(n));
        // !!!!!! Abbruchsbestimmung
        if (n <= 0) {
            return n;
        }
        return n + sumUpRecursive(n - 1);
    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // beginne mit 1,
            // laufe solange du kleiner gleich n bist
            // erhöhe nach jeder Iteration um i um 1
            sum = sum + i;
        }
        // retourniere das Ergebnis
        return sum;
    }

    public static int iterativeSum(ArrayList<Integer> values) {
        int sum = 0; // Zwischenspeicher der Summe
        //for (int i = 0; i < values.size(); i++)
        for (Integer value : values) { // for-each
            sum += value;
            //sum = sum + value; // andere Schreibweise zu sum += value
        }
        return sum; // ergebnis der addition wird zurück gegeben
    }

    public static int recursiveSum(ArrayList<Integer> values) {
        // Abbruchsbestimmung
        //if (values.isEmpty()) andere Möglichkeit zu ermitteln ob noch Werte in der Liste sind
        if (values.size() == 0) {
            return 0;
        }
        // gib mir den ersten Wert in der Liste und lösche in aus der Liste
        Integer value = values.remove(0);
        return value + recursiveSum(values); // values sind hier um 1 Eintrag kleiner
    }

    public static int sumUpBetweenRecursive(int start, int end) {
        if (start == end) {
            return start;
        }

        return start + sumUpBetweenRecursive(start + 1, end);
    }

    public static int sumDownBetweenRecursive(int start, int end){
        if (start == end) {
            return end;
        }

        return end + sumUpBetweenRecursive(start, end-1);
    }


}
