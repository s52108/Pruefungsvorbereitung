package online.fourthLesson.Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {


        System.out.println("fibonacci(10) = " + fibonacci(10));
        System.out.println("fibonacci(15) = " + fibonacci(15));
        System.out.println("fibonacci(20) = " + fibonacci(20));
        System.out.println("fibonacci(25) = " + fibonacci(25));
        System.out.println("fibonacci(30) = " + fibonacci(30));

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
