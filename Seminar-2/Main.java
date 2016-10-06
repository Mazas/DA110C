package tadas.ivanauskas;
/*
 * Created by hamekas on 9/23/16 @HKR ivanauskas15@gmail.com
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String choice = " ";
        int iChoice = 0;
        while (!(choice.equalsIgnoreCase("0")) || choice.equalsIgnoreCase(null)) {
            choice = JOptionPane.showInputDialog("Enter the number of the task (1-4)\nOr enter 0 to exit:");
            if (!(choice.equalsIgnoreCase(null))||choice.isEmpty()) {
                try {
                    iChoice = Integer.parseInt(choice);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                    continue;
                }
            }
            switch (iChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    Task1 task = new Task1();
                    String pNum;
                    String address;
                    String name;
                    name = JOptionPane.showInputDialog(null, "Enter your name:");
                    address = JOptionPane.showInputDialog(null, "Enter your address:");
                    pNum = JOptionPane.showInputDialog(null, "Enter your phone number:");
                    task.Bank(name, address, pNum);
                    int t1Choice = 0;
                    while (t1Choice != -1) {
                        t1Choice = task.menu();
                        double amount;
                        switch (t1Choice) {
                            case 0:
                                int confirm = JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Exit", JOptionPane.YES_NO_OPTION);
                                if (confirm==0){
                                    t1Choice=-1;
                                    break;
                                }else {
                                    break;
                                }
                            case 1:
                                JOptionPane.showMessageDialog(null,task.toString());
                                break;
                            case 2:
                                amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to deposit:"));
                                JOptionPane.showMessageDialog(null,task.deposit(amount));
                                break;
                            case 3:
                                amount= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to withdraw:"));
                                if (task.withdraw(amount)){
                                    JOptionPane.showMessageDialog(null,"Success!");
                                } else {
                                    JOptionPane.showMessageDialog(null,"You don't have enough money");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    String string2 = "";
                    double startingAmount = Double.parseDouble(JOptionPane.showInputDialog(null,"---Savings Calculator---\n" +
                            "Enter starting amount:"));
                    double rate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the interest rate:"));
                    JOptionPane.showMessageDialog(null,task2.task2("",startingAmount,rate));
                    for (int i=2;i<10;i++){
                        string2 = task2.task2(string2, startingAmount,i);
                    }
                    JOptionPane.showMessageDialog(null,string2);
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    int stacks = Integer.parseInt(JOptionPane.showInputDialog(null,"---Volume calculator---\n" +
                            "Please enter number of stacks:"));
                    double width = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the width:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter height:"));
                    double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter length:"));
                    JOptionPane.showMessageDialog(null,"The volume is: "+task3.task3(stacks,height,width,length));
                    break;
                case 4:
                    Task4 task4 = new Task4();
                    task4.setBalance(Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter initial balance:")));
                    for (int i = 1;i<=10;i++){
                        task4.task4(Double.parseDouble(JOptionPane.showInputDialog(null,"**This is a very nice text**\n" +
                                i+". Please enter the amount to deposit:")));
                    }
                    JOptionPane.showMessageDialog(null,task4.getBalance());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input");

            }
        }
    }
}
