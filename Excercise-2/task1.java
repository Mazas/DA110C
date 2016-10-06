/**
 * Created by hamekas on 9/7/16.
 */
import java.util.Scanner;
public class task1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to our bank!");
        System.out.print("Enter a name: ");
        String name = input.nextLine();              //Name
        System.out.print("Ente civic number: ");
        String cNumber = input.nextLine();           //Civic number
        System.out.print("Enter the amount of money: ");
        double money = input.nextDouble();           //Balance
        System.out.print("Enter interest rate in percentage: ");
        double interest = input.nextDouble();         //Interest rate
        interest = interest/100;                //make interest rate a fraction
        double result = money*interest+money;   //count the money after a year of saving
        System.out.format("%n");
        System.out.printf("Name: %s%nCivic number: %s%nBalance: %.2f SEK%nInterest rate: %.2f%n",
                name,cNumber, money,interest);
        System.out.format("%n");
        System.out.format("After one year you will have %.2f SEK%n", result);
        System.out.println("How much money do you want to deposit (SEK)?");
        double depo = input.nextDouble();
        System.out.println("How much money you want to withdraw (SEK)?");
        double withdraw = input.nextDouble();
        money = money+depo;
        money -= withdraw;
        System.out.format("Your new balance is %.2f SEK%n", money);
        System.out.println("--- --- --- --- ---");
        System.out.print("Add another person?");
        boolean person2 = input.nextBoolean();
        input.nextLine();
        if (person2==true){
            System.out.print("Enter a name: ");
            String name2 = input.nextLine();              //Name
            System.out.print("Ente civic number: ");
            String cNumber2 = input.nextLine();           //Civic number
            System.out.print("Enter the amount of money: ");
            double money2 = input.nextDouble();           //Balance
            System.out.print("Enter interest rate in percentage: ");
            double interest2 = input.nextDouble();         //Interest rate
            interest2 = interest2/100;                //make interest rate a fraction
            double result2 = money2*interest2+money2;   //count the money after a year of saving
            System.out.format("%n");
            System.out.printf("Name: %s%nCivic number: %s%nBalance: %.2f SEK%nInterest rate: %.2f%n",
                    name2,cNumber2, money2,interest2);
            System.out.format("%n");
            System.out.format("After one year you will have %.2f SEK%n", result2);
            System.out.println("How much money do you want to deposit (SEK)?");
            double depo2 = input.nextDouble();
            System.out.println("How much money you want to withdraw (SEK)?");
            double withdraw2 = input.nextDouble();
            money2 = money2+depo2;
            money2 -= withdraw2;
            System.out.format("Your new balance is %.2f SEK%n", money2);
        }
    }
}
