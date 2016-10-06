package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Task8 extends Task {
    public Task8(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String s = in.nextLine();
        System.out.print("Enter a number: ");
        for (int a = in.nextInt(); a>0; a--){
            System.out.printf("%s%n", s);
        } in.nextLine();
        System.out.print("Enter a message: ");
        s = in.nextLine();
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        while (a>0){
            System.out.printf("%s%n", s);
            a--;
        }
        Main.main(null);
    }
}
