package tadasIvanauskas;
/**Seminar 3 Tasks
 * Created by Tadas Ivanauskas
 * tadas.ivanauskas0002@stud.hkr.se
 * ivanauskas15@gmail.com*/
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            String choice = JOptionPane.showInputDialog(null, "Enter the task: 1-4", "Menu", JOptionPane.PLAIN_MESSAGE);
            switch (choice) {
                case "0":
                case "exit":
                case "x":
                    exit = true;
                    break;
                case "1":
                    Task1 task = new Task1();
                    task.task1start();
                    break;
                case "2":
                    Task2 task2 = new Task2();
                    task2.task2start();
                    break;
                case"3":
                    Task3 task3 = new Task3();
                    task3.task3start();
                    break;
                case"4":
                    Task4 task4 = new Task4();
                    task4.task4start();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No such task", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }
    }
}
