package online.thirdLesson;

import online.thirdLesson.campus02.Student;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {


        Student susi = new Student(123, "Susi Sorglos");
        Student guenter = new Student(123, "Günter Sorglos");
        Student philipp = new Student(321, "Philipp Mustermann");

        System.out.println("susi.equals(susi) = " + susi.equals(susi));
        System.out.println("susi.equals(guenter) = " + susi.equals(guenter));

        HashSet<Student> hashSetStudents = new HashSet<>();
        hashSetStudents.add(susi);
        hashSetStudents.add(guenter);
        hashSetStudents.add(philipp);

        System.out.println("hashSetStudents = " + hashSetStudents);

        hashSetStudents.remove(philipp);
        System.out.println("hashSetStudents = " + hashSetStudents);

        System.out.println("hashSetStudents.contains(susi) = " + hashSetStudents.contains(susi));
        System.out.println("hashSetStudents.contains(new Student(123,Susi Sorglos)) = " + hashSetStudents.contains(new Student(123,"Susi Sorglos")));


        for (Student s :
                hashSetStudents) {
            System.out.println("s = " + s);
        }
    }
}
