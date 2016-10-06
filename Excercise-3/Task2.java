package com.company;

/**
 * Created by hamekas on 9/15/16.
 */
import java.util.Scanner;
class Task2 extends Task {
    Task2(){
        Scanner in = new Scanner(System.in);
        String name;
        String address;
        int pnum;
        String ans= "";
        System.out.println("Welcome!");/*
        do {
            System.out.print("Enter your name: ");
            name = in.nextLine().trim();
            System.out.print("Enter your address: ");
            address = in.nextLine().trim();
            System.out.print("Enter your phone number: ");
            pnum = in.nextInt();
            System.out.println("<<Your information:>>");
            System.out.printf("Your name: %s%n" +
                    "Your address: %s%n" +
                    "Your phone number: %d%n" +
                    "------------------------------%n",name , address, pnum);
            in.nextLine();
            System.out.print("Is this information correct?");
            ans = in.nextLine().trim();
        } while (!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y")));
        Main.main(null);
        System.exit(0);*/
        while (!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y"))) {
            System.out.print("Enter your name: ");
            name = in.nextLine().trim();
            System.out.print("Enter your address: ");
            address = in.nextLine().trim();
            System.out.print("Enter your phone number: ");
            pnum = in.nextInt();
            System.out.println("<<Your information:>>");
            System.out.printf("Your name: %s%n" +
                    "Your address: %s%n" +
                    "Your phone number: %d%n" +
                    "------------------------------%n", name, address, pnum);
            in.nextLine();
            System.out.print("Is this information correct?");
            ans = in.nextLine().trim();
        }
        Main.main(null);
        System.exit(0);
    }
}
