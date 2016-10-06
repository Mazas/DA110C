/**
 * Created by hamekas on 9/6/16.
 */
import java.util.Scanner;
public class lec3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double sum;
        System.out.println("Enter a number: ");
        a = input.nextDouble();
        System.out.println("Enter a second number: ");
        b = input.nextDouble();
        sum = a + b;
        System.out.printf("Sum of %.2f and %.2f is %.2f", a, b, sum);
    }
}
