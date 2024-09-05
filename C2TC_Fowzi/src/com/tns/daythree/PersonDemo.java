package com.tns.daythree;


import java.lang.String;
import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        // Scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter Person Name: ");
        String name = ob.next();

        System.out.print("Enter Age: ");
        int age = ob.nextInt();

        System.out.print("Enter Gender: ");
        String gender = ob.next();

        System.out.print("Enter Taxable Income: ");
        int income = ob.nextInt();

        // Person object and initialize values using setter
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Display person details using toString() method
        System.out.println("Person Details Before Tax Calculation: ");
        System.out.println(person);

        // Tax calculation
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        // Display person details after tax calculation
        System.out.println("Person Details After Tax Calculation: ");
        System.out.println(person);

        ob.close();
    }
}
