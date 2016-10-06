package Seminar1;

/**
 * Created by hamekas on 9/11/16.
 */
import java.util.Scanner;
public class Task2 extends Task {
    public Task2(){
            Scanner in = new Scanner(System.in);
        String sAns = "";
        while (!(sAns.equalsIgnoreCase("no") || sAns.equalsIgnoreCase("n"))) {
            System.out.print("Please enter your gender: ");
            String gender = in.nextLine().toLowerCase().trim();
            while (!("male".equalsIgnoreCase(gender) || gender.equalsIgnoreCase("female") ||
                     gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")))
            {
                System.out.print("Please choose male or female: ");
                gender = in.nextLine().toLowerCase().trim();
            }
            System.out.print("Are you already registered user?: ");
            String reg = in.nextLine().trim();
            while (!(reg.equalsIgnoreCase("yes")|| reg.equalsIgnoreCase("no")|| reg.equalsIgnoreCase("n")||
                     reg.equalsIgnoreCase("y"))){
                System.out.print("Please enter yes or no: ");
                reg = in.nextLine().trim();
            }
            int age = 0;
            while (age <= 0) {
                System.out.print("Please enter your age: ");
                String sAge = in.nextLine().trim();
                try {
                    age = Integer.parseInt(sAge);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            }
                System.out.println("Please verify.");
                System.out.printf("Gender: %s%nRegistered: %s%nAge: %d%nyes/no?:", gender, reg, age);
                sAns = in.nextLine().trim();
                if (sAns.equalsIgnoreCase("yes") || sAns.equalsIgnoreCase("y")) {
                    System.out.println("Thank you!");
                    Main.main(null);
                    System.exit(0);
                } else if (sAns.equalsIgnoreCase("no") || sAns.equalsIgnoreCase("n")) {
                    continue;
                } else {
                    System.out.println("Invalid input.");
                }
            }
    }
}
