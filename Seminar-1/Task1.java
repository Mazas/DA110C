package Seminar1;

/**
 * Created by hamekas on 9/11/16.
 */
import java.util.Scanner;
public class Task1 extends Task {
    public Task1(){
        Scanner input = new Scanner(System.in);
        double money = 0;
        double tWithd= 0;
        double tDepo = 0;
        int noDepo = 0;
        int noWithd = 0;
        int counter = 0;
        String token = "";
        while (!token.equalsIgnoreCase("no")||!token.equalsIgnoreCase("n")) {
        while (counter<10){
            System.out.print("Enter the amount to deposit or withdraw: ");
            String sAmount = input.next().trim();
            int amount = 0;
            try {
                amount = Integer.parseInt(sAmount);
            }
            catch (NumberFormatException e) {
                System.out.println("This is not a number!");
            }
            input.nextLine();
            if (amount<0){
                money = money+amount;
                noWithd++;
                tWithd = tWithd+amount;
                counter++;
            } else if (amount>0){
                money = money+amount;
                noDepo++;
                tDepo = tDepo+amount;
                counter++;
            } else{
                System.out.println("Invalid amount");}
        }
        System.out.printf("Total depposit amount is: %10.2f%n" +
                "Total withdraw amount: %10.2f%n" +
                "Total balance: %10.2f%n" +
                "Times deposited: %10d%n" +
                "Times withdrawn: %10d%n",
                tDepo, tWithd, money, noDepo, noWithd);

            System.out.print("Do you want to repeat? y/n: ");
            token = input.nextLine().trim();
            if (token.equalsIgnoreCase("yes") || token.equalsIgnoreCase("y")) {
                counter = 0;
                continue;
            } else if (token.equalsIgnoreCase("no") || token.equalsIgnoreCase("n")) {
                Main.main(null);
                System.exit(0);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

}
