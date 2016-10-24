package tadasIvanauskas;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by hamekas on 10/15/16 @HKR ivanauskas15@gmail.com
 */
public class Task4 extends Task {
    void task4start() {
        Phone phone = new Phone();
        Phone current = null;
        Phone[] queue = new Phone[10];
        boolean exit = false;
        while (!exit) {
            String choice = JOptionPane.showInputDialog(null, phone.menu(), "Menu", JOptionPane.PLAIN_MESSAGE);
            switch (choice) {
                case "0":
                case "exit":
                case "x":
                    exit = true;
                    break;
                case "1": //new call
                    if (queue[9] == null) {
                        JTextField name = new JTextField();
                        JTextField number = new JTextField();
                        Object[] message = {
                                "Name: ", name,
                                "Number: ", number,
                        };
                        int option = JOptionPane.showConfirmDialog(null, message, "New Call",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (option == JOptionPane.OK_OPTION) {
                            for (int i = 0; i < 10; i++) {
                                if (queue[i]==null) {
                                    queue[i] = new Phone(name.getText().trim(), number.getText().trim());
                                    break;
                                }
                            }
                        }
                    } else {
                        error("Queue is already full!");
                    }
                    break;
                case "2"://answer
                    current = queue[0];
                    queue[0] = null;
                    for (int i = 1; i < 10; i++) {
                        queue[i - 1] = queue[i];
                        queue[i]=null;
                    }
                    System.out.println(current);
                    break;
                case "3"://current
                    System.out.println(current);
                    break;
                case "4"://queue
                    for (Phone p : queue) {
                        System.out.println(p);
                    }
                    break;
                case "5"://close call
                    current = null;
                    break;
                default:
                    error();
                    break;
            }

        }
    }
}
