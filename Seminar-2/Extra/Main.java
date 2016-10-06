package tadas.ivanauskas;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        double iniMoney = 0;
        int months = 0;
        Main task = new Main();
        String sIniMoney = JOptionPane.showInputDialog(null, "Enter the amount you want to loan:");
        if (sIniMoney.equalsIgnoreCase("extra")||sIniMoney.equalsIgnoreCase("x")){
            extra extra = new extra();
            System.exit(0);
        }
        try {
            iniMoney = Double.parseDouble(sIniMoney);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
        while (iniMoney >= 0) {
            months++;
            iniMoney = task.debt(iniMoney);
        }
        if (months < 24) {
            JOptionPane.showMessageDialog(null, "It would take you " + months + " months to return the loan.");
        } else {
            int years = months / 12;
            months %= 12;
            JOptionPane.showMessageDialog(null, "It would take you " + years + " years and " + months + " months to return the loan.");
        }
    }

    private double debt(double money) {
        money *= 1.1;
        money -= 200;
        return money;
    }
}
