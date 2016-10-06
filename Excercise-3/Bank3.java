package com.company;

/**
 * Created by hamekas on 9/16/16 @HKR.
 */
import java.util.Scanner;
public class Bank3 extends Bank {
    Bank3(Bank bankas){
        Bank bank  = bankas;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to exit.");
        int amount = 1;
        while (amount!=0) {
            System.out.println("Your current balance is: " + bank.getMoney());
            System.out.print("Enter the amount to deposit: ");
            amount = in.nextInt();
                int a = amount % 100;
                int money = bank.getMoney();
                bank.setMoney(money += (amount - a));
                System.out.printf("You have now: %d%n", money);
            }
        Task task;
        task = new Task3(bank);
    }

}
