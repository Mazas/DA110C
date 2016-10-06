package com.company;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Choose a task 1-4 or enter 0 to exit.");
        int schoice = 0;
        if (choice !=null && !choice.isEmpty()){
            try {
                schoice = Integer.parseInt(choice);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "This is not a number!");
                Main.main(null);
            }
        }
        else {
            System.exit(0);
        }
        Task task;
        while (schoice!=0){
            switch (schoice) {
                case 1:
                    task = new Task1(null);
                    break;
                case 2:
                    task = new Task2();
                    break;
                case 3:
                    task = new Task3(null);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No such task");
                    Main.main(null);
                    break;
            }
        }

    }
}
