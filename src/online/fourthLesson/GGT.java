package online.fourthLesson;

public class GGT {
    public static void main(String[] args) {
        System.out.println(ggtRecursive(8, 4));
        System.out.println(ggtRecursive(6, 2));
        System.out.println(ggtRecursive(112, 44));

    }


    public static int ggtRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        int rest = a % b;

        return ggtRecursive(b, rest);
    }
}
