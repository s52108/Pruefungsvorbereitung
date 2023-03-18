package online.secondLesson.Bestellverwaltung;

public class DemoOrderApp {
    public static void main(String[] args) {
        OrderLine mobilePhone1 = new OrderLine("Mobile Phone x7", 500, 1);
        OrderLine mobilePhone2 = new OrderLine("Mobile Phone x8", 600, 3);
        OrderLine mobilePhone3 = new OrderLine("Mobile Phone x9", 800, 2);
        OrderLine mobilePhone4 = new OrderLine("Mobile Phone x10", 1000, 4);
        OrderLine mobilePhone5 = new OrderLine("Mobile Phone x11", 1200, 5);

        OrderLine[] arrayOrderlines = {mobilePhone1, mobilePhone2, mobilePhone3, mobilePhone4, mobilePhone5};
        System.out.println("arrayOrderlines.length = " + arrayOrderlines.length);
        Order order4711 = new Order("AT001234567", arrayOrderlines);

        order4711.printOrder();

        System.out.println("order4711.getTotalCosts() = " + order4711.getTotalCosts());
        System.out.println("order4711.getAverageOrderLineCosts() = " + order4711.getAverageOrderLineCosts());
    
    }
}
