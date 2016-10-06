package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task7 extends Task {
    public Task7(){
        Scanner in = new Scanner(System.in);
        int a =1;
        while (a!=0){
            System.out.print("Enter a number: ");
            a = in.nextInt();
        }
        do {
            System.out.print("Enter a number #2: ");
            a = in.nextInt();
        } while (a!=0);
        Main.main(null);
    }
}
