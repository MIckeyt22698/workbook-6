package com.pluralsight;

import com.pluralsight.model.accounts.BankAccount;
import com.pluralsight.model.accounts.CreditCard;
import com.pluralsight.model.assets.Gold;
import com.pluralsight.model.assets.House;
import com.pluralsight.model.assets.Jewelry;
import com.pluralsight.model.Portfolio;

public class Main {
    public static void main(String[] args) {
        Portfolio myPortfolio = new Portfolio("My Assets", "Mickey");

        myPortfolio.add(new Jewelry("Gold Necklace", 18.0, 1500.0));
        myPortfolio.add(new Gold("Gold Bar", 1.0, 2000.0));
        myPortfolio.add(new House("Family Home", 1995, 2500, 4, 350000.0));

        BankAccount savings = new BankAccount("Chase Savings", "123456789", 5000.0);
        myPortfolio.add(savings);

        CreditCard visa = new CreditCard("Visa Platinum", "987654321", 1200.0);
        myPortfolio.add(visa);

        System.out.println("Portfolio Items:");
        myPortfolio.printAssets();

        System.out.printf("Total portfolio value: $%.2f%n", myPortfolio.getTotalValue());
    }
}