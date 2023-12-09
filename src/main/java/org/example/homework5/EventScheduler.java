package org.example.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventScheduler {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();

        createEvents("Warning", currentTime, currentTime + 10000);
        createEvents("Critical", currentTime, currentTime + 15000);
        scanActiveEvents(currentTime);
        findExpireEvents(currentTime);

    }

    private static List<Event> events = new ArrayList<>();

    private static void createEvents(String name, long creationTime, long expireTime) {
        Event newEvent = new Event(name, creationTime, expireTime);
        events.add(newEvent);
        System.out.println("Event:" + name);
    }

    private static void scanActiveEvents(long currentTime) {
        System.out.println("Active Events:");
        for (Event event : events) {
            if (event.getExpireTime() > currentTime) {
                System.out.println(event.getName() + ":" + event.getExpireTime());
            }
        }
    }

    private static void findExpireEvents(long currentTime) {
        System.out.println("Expire Events:");
        Iterator<Event> eventIterator = events.iterator();

        while (eventIterator.hasNext()) {
            Event event = eventIterator.next();
            if (event.getExpireTime() >= currentTime) {
                System.out.println(event.getName() + ":" + event.getCreationTime() + "->" + event.getExpireTime());
                eventIterator.remove();
            }
        }
    }
}
