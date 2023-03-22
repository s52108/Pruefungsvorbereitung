package online.fourthLesson.PalindromChecker;

public class PalindromCheck {
    public static void main(String[] args) {
        String test = "Ro!t!o!r";
        System.out.println("check(test) = " + check(test));
    }

    public static boolean check(String palindrom) {

        palindrom = palindrom.toLowerCase();
        if (palindrom.length() == 1 || palindrom.length() == 0) {
            return true;
        }

        char firstChar = palindrom.charAt(0);
        if (!Character.isLetter(firstChar)) {
            String newPalindrom = palindrom.substring(1);
            return check(newPalindrom);
        }

        char lastChar = palindrom.charAt(palindrom.length() - 1);
        if (!Character.isLetter(lastChar)) {
            String newPalindrom = palindrom.substring(0, palindrom.length() - 1);
            return check(newPalindrom);
        }

        if (firstChar == lastChar) {
            return check(palindrom.substring(1, palindrom.length() - 1));
        }

        return false;

    }
}
