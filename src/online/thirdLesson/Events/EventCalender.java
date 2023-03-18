package online.thirdLesson.Events;

import java.util.ArrayList;
import java.util.HashMap;

public class EventCalender {

    private final ArrayList<Event> events;

    public EventCalender() {
        this.events = new ArrayList<>();
    }

    public void add(Event newEvent) {
        events.add(newEvent);
    }

    public void printEvents() {
        for (Event e :
                events) {
            System.out.println(e.toString());
        }
    }

    public Event findByTitle(String title) {
        for (Event e :
                events) {
            if (e.getTitel().equals(title)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByLocation(String ort) {
        ArrayList<Event> result = new ArrayList<Event>();
        for (Event e :
                events) {
            if (e.getLocation().equals(ort)) {
                result.add(e);
            }
        }
        return result;
    }

    public Event getMostExpensiveByOrt(String location) {
        ArrayList<Event> eventsInLocation = getByLocation(location);
        double maxprice = -1;
        for (Event e :
                eventsInLocation) {
            if (e.getPrice() > maxprice) {
                maxprice = e.getPrice();
            }
        }
        for (Event e :
                eventsInLocation) {
            if (e.getPrice() == maxprice) {
                return e;
            }
        }
        return null;
    }

    public HashMap<String, Integer> getCountEventsByLocation() {
        HashMap<String, Integer> result = new HashMap<>();
        for (Event e :
                events) {
            if (result.containsKey(e.getLocation())) {
                Integer count = result.get(e.getLocation());
                count++;
                result.put(e.getLocation(), count);
            } else {
                result.put(e.getLocation(), 1);
            }
        }

        return result;

    }
}
