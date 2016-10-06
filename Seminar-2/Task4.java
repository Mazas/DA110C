package tadas.ivanauskas;

/**
 * Created by hamekas on 9/23/16 @HKR ivanauskas15@gmail.com
 */
class Task4 {
    private double balance = 0;
    void setBalance(double balance){
        this.balance = balance;
    }
    double task4(double amount){
        amount=bonus(amount);
        balance+=amount;
        return balance;
    }
    private double bonus(double amount){
        amount = amount * 1.1;
        return amount;
    }
    double getBalance(){
        return balance;
    }
}
