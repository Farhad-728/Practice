package org.example.homework5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventScheduler {
    private static LocalDate currentTime;

    public static void main(String[] args) {

        createEvents("Warning", LocalDate.of(2023,9, 9), LocalDate.of(2023, 10, 10));
        createEvents("Critical", LocalDate.of(2023,10, 2), LocalDate.of(2023, 12, 12));
        scanActiveEvents(LocalDate.now());
        findExpireEvents(LocalDate.now());

    }

    private static List<Event> events = new ArrayList<>();

    private static void createEvents(String name, LocalDate creationTime, LocalDate expireTime) {
        Event newEvent = new Event(name, creationTime, expireTime);
        events.add(newEvent);
        System.out.println("Event:" + name);
    }

    private static void scanActiveEvents(LocalDate currentTime) {
        System.out.println("Active Events:");
        for (Event event : events) {
            if (event.getExpireTime().isAfter(currentTime)) {
                System.out.println(event.getName() + ":" + event.getExpireTime());
            }
        }
    }

    private static void findExpireEvents(LocalDate currentTime) {
        System.out.println("Expire Events:");
        Iterator<Event> eventIterator = events.iterator();

        while (eventIterator.hasNext()) {
            Event event = eventIterator.next();
            if (event.getExpireTime().isBefore(currentTime)) {
                System.out.println(event.getName() + ":" + event.getCreationTime() + "->" + event.getExpireTime());
                eventIterator.remove();
            }
        }
    }
}
