package com.company;

import java.util.Scanner;
class Task3 extends Task {
    Task3(Bank bankas){
        Bank bank = bankas;

        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (choice!=5) {
            System.out.printf("- - - - Welcome to Bank of Hkr - - - -\n" +
                    "1) New account\n" +
                    "2) View account\n" +
                    "3) Deposit\n" +
                    "4) Withdraw\n" +
                    "5) Exit\n" +
                    "- - - - - - - - - - - - - - - - - - - - - - - - - -%n");
            choice = in.nextInt();
            Task task;
            if (choice==1){
                bank = new Bank1();
                break;
            } else if (choice==2){
                System.out.println(bank.toString());
            } else if (choice==3){
                bank = new Bank3(bank);
            }else if (choice==4){
                task = new Task1(bank);
            }else if (choice>5 || choice<1){
                System.out.print("Invalid input!%n");
            }
        }
        System.exit(0);
    }
}
