package online.firstLesson.Faculty;

public class FacultyCalculation {

    public FacultyCalculation(long input) throws NegativeNumberException {
        long output = 1;
        if (input < 2 && input > 0) {
            output = 1;
        } else if (input >= 2) {
            for (int i = 1; i <= input; i++) {
                output = output * i;
            }
        } else if (input < -2) {
            throw new NegativeNumberException(input);
        }


        System.out.println(+input + "! = " + output + ".");

    }
}
