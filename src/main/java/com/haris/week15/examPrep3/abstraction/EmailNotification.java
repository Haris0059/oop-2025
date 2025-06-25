package com.haris.week15.examPrep3.abstraction;

public class EmailNotification extends AbstractNotification {
    private String subject;
    private String lastSentTo;

    public EmailNotification(String subject) {
        this.subject = subject;
    }

    @Override
    public void send(String recipient) {
        this.lastSentTo = recipient;
        System.out.printf("Email with subject %s sent to %s.%n", this.subject, recipient);
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLastSentTo() {
        return lastSentTo;
    }
    public void setLastSentTo(String lastSentTo) {
        this.lastSentTo = lastSentTo;
    }
}
