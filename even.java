/**
 * Created by hamekas on 9/6/16.
 */
import java.util.Scanner;
public class even {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Write the first number: ");
        a = input.nextDouble();
        System.out.println("Write the scond number: ");
        b = input.nextDouble();
        if (a==b) {
            System.out.printf("Number are equal. The number was %.2f%n", a);
        }
        else {
            System.out.printf("Number are different. The numbers were %.2f %f.2%n", a, b);
        }
    }
}
