package tadas.ivanauskas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String choice = "";
        while (!(choice.equalsIgnoreCase("0") || choice.equalsIgnoreCase("exit") || choice.equalsIgnoreCase("-1"))) {
            choice = JOptionPane.showInputDialog(null, "Choose a task");
            switch (choice) {
                case "1":
                    Task1 task = new Task1();
                    double[] arr = new double[3];
                    for (int i = 0; i < 3; i++) {
                        String a = JOptionPane.showInputDialog(null, "Enter a number");
                        arr[i] = Double.parseDouble(a);
                    }
                    JOptionPane.showMessageDialog(null, "Smallest number is:" + task.smallest(arr) +
                            "\nThe biggest number is:" + task.biggest(arr) + "\nThe average is:" + task.average(arr) +
                            "\nThe sum is:" + task.sum(arr));
                    break;
                case "2":
                case "3":
                    Task2[] task2 = new Task2[10];
                    String t2Choice = "";
                    int acc = 0;
                    while (acc == 0) {
                        acc = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                    }
                    while (!(t2Choice.equalsIgnoreCase("exit") || t2Choice.equalsIgnoreCase("0"))) {
                        t2Choice = JOptionPane.showInputDialog(null, "Choose the converter:\n" +
                                "1.Feet to meters\n2.Meter to feet\n3.Kilo to pound\n4.Pound to kilo\n5.Change account\n0.Exit");
                        switch (t2Choice) {
                            case "1":
                                JOptionPane.showMessageDialog(null, task2[acc].ftm(
                                        JOptionPane.showInputDialog(null, "Enter feet:")) + "meter");
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, task2[acc].mtf(
                                        JOptionPane.showInputDialog(null, "Enter meters:")) + "feet");
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null, task2[acc].ktp(
                                        JOptionPane.showInputDialog(null, "Enter kilograms:")) + "pounds");
                                break;
                            case "4":
                                JOptionPane.showMessageDialog(null, task2[acc].ptk(
                                        JOptionPane.showInputDialog(null, "Enter pounds:")) + "kilograms");
                                break;
                            case "5":
                                acc = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                                break;
                        }
                    }
                case "4":
                case "5":
                    Task4[] task4 = new Task4[100];
                    for (int i = 0; i<100;i++){
                        task4[i]=new Task4();
                    }
                    String t4Choice = "";
                    int acc4 = 0;
                    while (acc4 == 0) {
                        acc4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                        task4[acc4] = new Task4();
                    }
                    while (!(t4Choice.equalsIgnoreCase("exit") || t4Choice.equalsIgnoreCase("0"))) {
                        t4Choice = JOptionPane.showInputDialog(null, "Welcome to Bank HKR:\n" +
                                "1.Withdraw\n2.Deposit\n3.Show info\n4.Change account\n5.Create account\n0.Exit");
                        switch (t4Choice) {
                            case "1":
                                JOptionPane.showMessageDialog(null, task4[acc4].withdraw(Double.parseDouble(
                                        JOptionPane.showInputDialog(null, "Enter the amount:"))));
                                break;
                            case "2":
                                JOptionPane.showMessageDialog(null, task4[acc4].deposit(Double.parseDouble(
                                        JOptionPane.showInputDialog(null, "Enter the amount:"))));
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null, task4[acc4].toString());
                                break;
                            case "4":
                                acc4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number"));
                                break;
                            case "5":
                                String name = JOptionPane.showInputDialog(null, "Enter your name:");
                                String address = JOptionPane.showInputDialog(null, "Enter your address:");
                                String pNUm = JOptionPane.showInputDialog(null, "Enter your phone number:");
                                task4[acc4].Bank(name, address, pNUm);
                                break;
                        }
                    }
                    break;
                case "7":
                    task = new Task1();
                    JOptionPane.showMessageDialog(null, task.primes(Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Enter how much primes you want to see:"))));
                    break;
            }
        }
    }
}
