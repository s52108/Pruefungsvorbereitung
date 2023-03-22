package online.fourthLesson.Printer;

public class Printer {
    public static void main(String[] args) {
        printFromNToZero(5);
        printFromNToZeroRecursive(6);
        printFromZeroToNRecursive(7);
    }

    public static void printFromNToZero(int n) {
        while (n >= 0) {
            System.out.println("n = " + n);
            n--;
        }
    }

    public static void printFromNToZeroRecursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        printFromNToZero(n - 1);

    }

    public static void printFromZeroToNRecursive(int n) {
        if (n < 0) {
            return;
        }
        printFromZeroToNRecursive(n - 1);
        System.out.println("n = " + n);
    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecursiveAcc(n - 1, acc);
    }

    public static int sumUpRecursive(int n) {
        if (n <= 0) {
            return n;
        }

        return n + sumUpRecursive(n - 1);
    }
}
