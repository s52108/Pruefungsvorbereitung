package online.firstLesson.LeapYear;

import online.firstLesson.IncomeTax.IncomeBelowZero;

public class LeapYear {

     public LeapYear(int inputYear) throws NotAValidYearException {

        if (inputYear >10000) {
                throw new NotAValidYearException(inputYear);

        } else if (inputYear< -5000) {
            throw new NotAValidYearException(inputYear);
        }

        System.out.println("Ihr gewähltes Jahr ist " + inputYear + ". ");

        if (inputYear % 4 == 0 && inputYear % 400 == 0) {

            System.out.println(inputYear + " ist ein Schaltjahr.");

        } else if (inputYear % 4 == 0 && inputYear % 100 != 0) {

            System.out.println(inputYear + " ist ein Schaltjahr.");

        } else {
            System.out.println(inputYear + " ist kein Schaltjahr.");
        }



    }

}
