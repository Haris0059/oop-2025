package com.haris.week15.examPrep2.abstraction;

public class OnlineEventManager extends EventManager {
    private String name;
    private String scheduledDate;

    public OnlineEventManager(String name) {
        this.name = name;
    }

    public String getEventName() {
        return this.name;
    }

    @Override
    public void scheduleEvent(String eventDate) {
        this.scheduledDate = scheduledDate;
        System.out.println("Event " + this.name + " scheduled for " + eventDate + ".");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }
    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
}
