package com.haris.week15.examPrep2.inheritance;

public class InvestmentIncome extends Income {
    private String investmentType;

    public InvestmentIncome(double amount, double taxRate, String investmentType) {
        super(amount, taxRate);
        this.investmentType = investmentType;
    }

    @Override
    public double calculateTax() {
        return this.getAmount() * this.getTaxRate() * 1.15;
    }

    public String getInvestmentType() {
        return investmentType;
    }
    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }
}
