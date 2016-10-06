package com.company;

/**
 * Created by hamekas on 9/15/16.
 */
import java.util.Scanner;
class Bank1 extends Bank {
     Bank1(){
        Scanner in= new Scanner(System.in);
        String ans = "";
        Bank bank = new Bank();
        while (!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y"))) {
            System.out.print("Enter your name: ");
            bank.setName(in.nextLine().trim());
            System.out.print("Enter your address: ");
            bank.setAddress(in.nextLine().trim());
            System.out.print("Enter your personal number: ");
            bank.setPnum(in.nextInt());
            System.out.print("Enter your balance: ");
            bank.setMoney(in.nextInt());
            System.out.println("<<Your information:>>");
            System.out.println(bank);
            in.nextLine();
            System.out.print("Is this information correct?");
            ans = in.nextLine().trim();
        }
        Task task;
        task = new Task3(bank);

    }
}
