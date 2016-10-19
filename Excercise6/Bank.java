package tadasIvanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 10/13/16 @HKR ivanauskas15@gmail.com
 */
class Bank extends Task1 {
    private double balance;
    private Task owner;
    Bank(){
        this("","",0,"");
    }
    Bank(Task owner){
        this.owner=owner;
    }
    Bank(String name, String ssn, int pnum, String address) {
        super(name, ssn, pnum, address);
        this.balance = 0;
    }
    void withdraw(double amount){
        if (amount>balance){
            JOptionPane.showMessageDialog(null,"You don't have enough money!","You're poor!",JOptionPane.ERROR_MESSAGE);
        }else{
            this.balance-=Math.abs(amount);
        }
    }
    void deposit(double amount){
        balance=balance+Math.abs(amount);
    }

    @Override
    public String toString() {
        return "Bank:\n"+owner.toString()+ "\nBalance: "+balance;
    }
    String menu(){
        return "---Welcome to our Bank---\n" +
                "Enter 1 to deposit\n" +
                "Enter 2 to withdraw\n" +
                "Enter 3 to show account information";
    }
}
