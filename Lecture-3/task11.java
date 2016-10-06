/**
 * Created by hamekas on 9/6/16.
 */
import java.util.Scanner;
public class task11 {
    public static void main(String[]args){
        Scanner input  =new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        Person person1 = new Person(name, age);
        System.out.printf("%s is %d years old.%n", person1.getName(), person1.getAge());
        System.out.println("--- --- --- --- ---");
        System.out.print("Add person? true/false");
        boolean ans = input.nextBoolean();
        if (ans==true){
            System.out.print("Enter name: ");
            input.nextLine();
            String name2 = input.nextLine();
            System.out.print("Enter age: ");
            int age2 = input.nextInt();
            Person person2 = new Person(name2, age2);
            System.out.printf("%s is %d years old.%n", person2.getName(), person2.getAge());
        }
        System.out.print("Change? ");
        ans= input.nextBoolean();
        if (ans==true){
            System.out.print("Enter name: ");
            input.nextLine();
            name = input.nextLine();
            person1.setName(name);
            System.out.print("Enter age: ");
            age = input.nextInt();
            person1.setAge(age);

            System.out.printf("%s is %d years old.%n", person1.getName(), person1.getAge());

        }
        }

    }
