package online.thirdLesson;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentMapDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> gradesOfStudents = new HashMap<>();

        gradesOfStudents.put("Susi Sorglos", new ArrayList<>());
        gradesOfStudents.put("Max Mustermann", new ArrayList<>());

        System.out.println("gradesOfStudents = " + gradesOfStudents);

        ArrayList<Integer> grades;
        grades = gradesOfStudents.get("Susi Sorglos");
        grades.add(1);
        grades.add(3);

        grades = gradesOfStudents.get("Max Mustermann");
        grades.add(3);
        grades.add(2);

        System.out.println("gradesOfStudents = " + gradesOfStudents);


        //gradesOfStudents.remove("Susi Sorglos");
        System.out.println("gradesOfStudents = " + gradesOfStudents);

        System.out.println(gradesOfStudents.containsKey("Max Mustermann"));

        for (String student :
                gradesOfStudents.keySet()) {
            System.out.println("student = " + student);
            
        }

    }
}
