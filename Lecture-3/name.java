/**
 * Created by hamekas on 9/6/16.
 */
import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.util.Scanner;
public class name {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.printf("Enter your first name: ");
        firstName = input.next();
        System.out.printf("Enter your last name: ");
        lastName = input.next();
        System.out.format("You are %n%s%n%s", firstName, lastName);


    }
}
