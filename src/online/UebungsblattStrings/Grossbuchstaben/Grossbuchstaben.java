package online.UebungsblattStrings.Grossbuchstaben;

public class Grossbuchstaben {

    String input;

    public static String wortanfangGross(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (i == 0 || input.charAt(i - 1) == ' ') {
                c = Character.toUpperCase(c);
            }

            result = result + c;
        }

        System.out.println("Ausgangstext: " + input);
        System.out.println("Ergebnis: " + result);
        return result;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Großbuchstaben{" +
                "input='" + input + '\'' +
                '}';
    }
}




