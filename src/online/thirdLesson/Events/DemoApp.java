package online.thirdLesson.Events;

public class DemoApp {
    public static void main(String[] args) {

        EventCalender eventCalender = new EventCalender();

        eventCalender.add(new Event("David Haselhoff", "Graz", 79));
        eventCalender.add(new Event("David Haselhoff", "Schladming", 79));
        eventCalender.add(new Event("David Haselhoff", "Malibu", 79));
        eventCalender.add(new Event("Finch Asozial", "Graz", 73));
        eventCalender.add(new Event("Grundlagen derSoftwareentwicklung", "Graz", 0));

        eventCalender.printEvents();

        System.out.println(eventCalender.findByTitle("David Haselhoff"));
        System.out.println(eventCalender.getByLocation("Graz"));

        System.out.println(eventCalender.getMostExpensiveByOrt("Graz"));

        System.out.println(eventCalender.getCountEventsByLocation());


    }

}
