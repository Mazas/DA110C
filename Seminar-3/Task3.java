package tadasIvanauskas;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by hamekas on 10/15/16 @HKR ivanauskas15@gmail.com
 */
class Task3 extends Task {

    void task3start() {
        int truckSize = 0;
        //INPUT START
        JTextField length = new JTextField();
        JTextField width = new JTextField();
        JTextField height = new JTextField();
        Object[] message = {
                "Length", length,
                "Width", width,
                "Height", height,
        };
        int confirm = JOptionPane.showConfirmDialog(null, message, "Enter the Size of the Truck",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //INPUT END

        //If ok is clicked
        if (confirm == JOptionPane.OK_OPTION) {
            //if the input is number, parse values from input and calculate the size of the truck
            if (isNumber(length.getText()) && isNumber(height.getText()) && isNumber(width.getText())) {
                truckSize = Integer.parseInt(length.getText()) * Integer.parseInt(width.getText()) *
                        Integer.parseInt(height.getText());

                //IF the input is not the number, show error and exit
            } else {
                error();
                System.exit(0);
            }
        }
        int[] bankBags = new int[3];
        for (int i = 0; i < 3; i++) {
            //INPUT
            length.setText("");
            width.setText("");
            height.setText("");
            confirm = JOptionPane.showConfirmDialog(null, message, "Enter the Size of Bags",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            //IF OK is clicked
            if (confirm == JOptionPane.OK_OPTION) {
                //IF input is number, parse values and create an object for bag
                if (isNumber(length.getText()) && isNumber(height.getText()) && isNumber(width.getText())) {
                    BankBags bags = new BankBags(Integer.parseInt(length.getText()), Integer.parseInt(width.getText()),
                            Integer.parseInt(height.getText()));
                    bankBags[i]= bags.getBags();

                    //IF input is not the number, show error and exit
                } else {
                    error();
                    System.exit(0);
                }
            }
        }
        JOptionPane.showMessageDialog(null,calculateBags(bankBags,truckSize) , "Bags", JOptionPane.PLAIN_MESSAGE);
    }

    private String calculateBags(int[] bags, int truckSize) {
        Arrays.sort(bags);
        int bag1=bags[0];
        int bag2=bags[1];
        int bag3=bags[2];
        int iBig = 0;
        int iMed = 0;
        int iSmall = 0;
            while (truckSize >=bag3) {
                truckSize -= bag3;
                iBig++;
            }
            while (truckSize >= bag2) {
                truckSize -= bag2;
                iMed++;
            }
            while (truckSize >= bag1) {
                truckSize -= bag1;
                iSmall++;
            }
            return "Big bags: " + iBig + "\nMedium bags: "
                    + iMed + "\nSmall bags: " + iSmall +
                    "\nLeftover space " + truckSize;
    }
}

