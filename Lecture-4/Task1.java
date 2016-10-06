package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task1 extends Task{
    public Task1(){
        int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        try {
            a = input.nextInt();
        } catch (Exception e){
            System.out.println("It is not an integer!");
        }
        input.nextLine();
        if ( a==5){
            System.out.println("Good");
        } else if (a>5 || a<5){
            System.out.println("Ok");
        }
        Main.main(null);
    }
}
