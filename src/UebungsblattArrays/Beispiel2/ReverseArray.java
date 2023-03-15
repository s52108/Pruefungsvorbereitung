package UebungsblattArrays.Beispiel2;

public class ReverseArray {
    public static void main(String[] args) {

        String input1 = "Hallo";
        String input2 = "Max";
        String input3 = "Mustermann";
        String input4 = "Ole";

        String[] inputs = new String[]{input1, input2, input3,input4};
        System.out.println(java.util.Arrays.toString(inputs));
        System.out.println(java.util.Arrays.toString(reverseArray(inputs)));

    }

    public static String[] reverseArray(String[] arrayToReverse) {
        String[] reversedArray = new String[arrayToReverse.length];
        for (int i = arrayToReverse.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arrayToReverse[i];
        }
        return reversedArray;
    }
}
