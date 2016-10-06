package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Task task;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a task or enter 0 to exit: ");
        int choice = input.nextInt();
        while (choice!=0) {
            switch (choice) {
                case 1:
                case 2:
                    task = new Task1();
                case 3:
                    task = new Task3();
                case 4:
                    task = new Task4();
                case 5:
                    task = new Task5();
                case 6:
                    task = new Task6();
                case 7:
                    task = new Task7();
                case 8:
                    task = new Task8();
                case 9:
                case 10:
                    task = new Task9();
                case 11:
                    task = new Task11();
                default:
                    System.out.println("No such task.");
                    Main.main(null);
            }
        }
    }
}
