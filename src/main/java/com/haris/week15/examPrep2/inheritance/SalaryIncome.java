package com.haris.week15.examPrep2.inheritance;

public class SalaryIncome extends Income {
    private double bonus;

    public SalaryIncome(double amount, double taxRate, double bonus) {
        super(amount, taxRate);
        this.bonus = bonus;
    }

    @Override
    public double calculateTax() {
        return this.getAmount() * this.getTaxRate() + this.getBonus() + 0.10;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
