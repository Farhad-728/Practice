package org.example.homework5;

import java.time.LocalDate;

public class Event {
    private String name;
    private LocalDate creationTime;
    private LocalDate expireTime;

    public Event(String name, LocalDate creationTime, LocalDate expireTime) {
        this.name = name;
        this.creationTime = creationTime;
        this.expireTime = expireTime;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationTime() {
        return creationTime;
    }

    public LocalDate getExpireTime() {
        return expireTime;
    }
}