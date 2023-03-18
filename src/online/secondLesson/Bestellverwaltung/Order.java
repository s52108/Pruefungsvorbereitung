package online.secondLesson.Bestellverwaltung;

import java.util.Arrays;

public class Order {

    private String number;
    private OrderLine[] arrayOfOrderLines;

    public String getNumber() {
        return number;
    }

    public void printOrder() {
        System.out.println("Order has " + arrayOfOrderLines.length + " lines:");
        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            System.out.println(arrayOfOrderLines[i].toString());
        }
    }

    public double getTotalCosts() {
        double costs = 0;
        for (int i = 0; i < arrayOfOrderLines.length; i++) {
            costs += arrayOfOrderLines[i].getCost();

        }
        return costs;
    }

    public double getAverageOrderLineCosts() {
        return getTotalCosts() / (arrayOfOrderLines.length * 1.0);
    }

    public OrderLine[] getArrayOfOrderLinesL() {
        return arrayOfOrderLines;
    }

    public Order(String number, OrderLine[] arrayOfOrderLines) {
        this.number = number;
        this.arrayOfOrderLines = arrayOfOrderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", arrayOfOrderLines=" + Arrays.toString(arrayOfOrderLines) +
                '}';
    }
}
