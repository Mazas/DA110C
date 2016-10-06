package tadas.ivanauskas;

/*
  Created by hamekas on 9/23/16 @HKR ivanauskas15@gmail.com
 */
import javax.swing.*;
class Task1 {
    private double balance;
    private String name;
    private String address;
    private String pNum;
    private int ACCOUNT_NUMBER;
    private static int id= 0;
    void Bank(String name, String address, String pNum){
        this.name=name;
        this.address=address;
        this.pNum=pNum;
        ACCOUNT_NUMBER=++id;
    }
    public String toString(){
        return "Your name: "+name+"\n"+"Your address: "+address+
                "\n"+"Your phone number: "+pNum+"\n"+"Your account number: "+ACCOUNT_NUMBER;
    }
    int menu(){
        int iChoice=-2;
        String choice = JOptionPane.showInputDialog(null, "---Welcome to our bank!---\n"+
                "Choose 1 to show information.\n" +
                "Choose 2 to deposit.\n"+"Choose 3 to withdraw\n"+"Choose 0 to exit");
        try{
            iChoice = Integer.parseInt(choice);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input!");
        }
        return iChoice;
    }
    boolean withdraw(double amount){
        if (balance>amount){
            balance-=amount;
            return true;
        } else {
            return false;
        }
    }
    double deposit(double amount){
        balance+=amount;
        return balance;
    }
}
