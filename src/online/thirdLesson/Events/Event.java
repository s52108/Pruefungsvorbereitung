package online.thirdLesson.Events;

import java.util.Objects;

public class Event {

    private String titel;
    private String location;
    private double price;

    public Event(String titel, String ort, double eintrittspreis) {
        this.titel = titel;
        this.location = ort;
        this.price = eintrittspreis;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Double.compare(event.price, price) == 0 && Objects.equals(titel, event.titel) && Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, location, price);
    }


    @Override
    public String toString() {
        return "Event{" +
                "titel='" + titel + '\'' +
                ", ort='" + location + '\'' +
                ", eintrittspreis=" + price +
                '}';
    }
}
