package org.javamoney;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String... args){
        double exchangeRate;
        double amount;
        double convertedAmount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the exchange rate: ");
        exchangeRate = scanner.nextDouble();

        System.out.println("Enter the amount to convert: ");
        amount = scanner.nextDouble();

        convertedAmount = amount * exchangeRate;

        System.out.println(amount + " dollars is equivalen to " + convertedAmount + " shillings.");
    }
}