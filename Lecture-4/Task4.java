package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task4 extends Task {
    public Task4(){
        Scanner input = new Scanner(System.in);
        double a;
        System.out.print("Enter a number");
        a= input.nextDouble();
        if (5>a && a>=0){
            System.out.println("small");
        }else if (a<10 && a>=5){
            System.out.println("Bigger");
        } else {
            System.out.println("Not valid");
        }
        Main.main(null);
    }
}
