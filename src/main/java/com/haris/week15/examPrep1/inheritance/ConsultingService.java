package com.haris.week15.examPrep1.inheritance;

public class ConsultingService extends Service {
    private int hoursWorked;

    public ConsultingService(String name, int baseFee, int hoursWorked) {
        super(name, baseFee);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.hoursWorked * 1.20;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
