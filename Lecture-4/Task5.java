package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task5 extends Task {
    public Task5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter yes or no?");
        String s = in.nextLine();
        String ss = s.toLowerCase();
        switch (ss){
            case "yes":
                System.out.println("Good");
                break;
            case "no":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Error");
                break;
        }
        Main.main(null);
    }
}
