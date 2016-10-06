package lec2;

/**
 * Created by hamekas on 9/10/16.
 */
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = String.format("Enter the number of the item:%n" +
                "1. item1%n" +
                "2. item2%n" +
                "3. item3%n");
        String sChoice = JOptionPane.showInputDialog(list);
        int choice = Integer.parseInt(sChoice);
        while (choice!=0){
            Task item;
            switch (choice){
                case 1:
                    item = new Task1();
                    break;
                case 2:
                    item = new Task2();
                    break;
                case 3:
                    item = new Task3();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No such item");
                    break;
            }
            sChoice= JOptionPane.showInputDialog(list);
            choice = Integer.parseInt(sChoice);

        }
    }

}
