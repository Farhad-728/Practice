package org.example.homework5;

public class Event {
    private String name;
    private long creationTime;
    private long expireTime;

    public Event(String name, long creationTime, long expireTime) {
        this.name = name;
        this.creationTime = creationTime;
        this.expireTime = expireTime;
    }

    public String getName() {
        return name;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public long getExpireTime() {
        return expireTime;
    }
}