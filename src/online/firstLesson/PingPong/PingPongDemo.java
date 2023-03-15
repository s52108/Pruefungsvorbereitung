package online.firstLesson.PingPong;

public class PingPongDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println(i + " | Ping Pong");
            } else if (i % 3 == 0) {
                System.out.println(i + " | Pong");
            } else if (i % 2 == 0) {
                System.out.println(i + " | Ping");
            } else System.out.println(i + " | _-_ ");
        }
    }
}
