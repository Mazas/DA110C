package tadas.ivanauskas;
/**
 * Created by hamekas on 9/26/16 @HKR ivanauskas15@gmail.com
 */
class Task4 {
    private double balance;
    private String name;
    private String address;
    private String pNum;
    private int ACCOUNT_NUMBER;
    private static int id = 0;

    void Bank(String name, String address, String pNum) {
        this.name = name;
        this.address = address;
        this.pNum = pNum;
        ACCOUNT_NUMBER = ++id;
    }

    public String toString() {
        return "Your name: " + name + "\n" + "Your address: " + address +
                "\n" + "Your phone number: " + pNum + "\n" + "Your account number: " + ACCOUNT_NUMBER;
    }

    boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }
}

