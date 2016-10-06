package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task3 extends Task {
    public Task3(){
        int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        try{
            a = input.nextInt();
        }
        catch (Exception e){
            System.out.println("This is not a number!");;
        }
        if (a<0){
            System.out.println("Number is negative.");
        } else if (a>0){
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is 0");
        }
        Main.main(null);
    }
}
