package com.tns.daythree;

public class TaxCalculation {
    public void calculateTax(Person person) {
        int income = person.getIncome();
        double tax = 0;

        // Simple tax calculation based on income
        if (income < 50000) {
            tax = 0; // No tax for income less than 50,000
        } else if (income >= 50000 && income <= 100000) {
            tax = income * 0.1; // 10% tax
        } else {
            tax = income * 0.2; // 20% tax for income above 100,000
        }

        // Set calculated tax in the person object
        person.setTax(tax);
    }
}
