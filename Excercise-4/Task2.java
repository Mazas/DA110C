package tadas.ivanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 9/26/16 @HKR ivanauskas15@gmail.com
 */
class Task2 {
    private double feet, meters, pounds, kilo;
    double ftm(String s){
        feet=0;
        try {
            feet= Double.parseDouble(s);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
        feet*=0.3048;
        return feet;
    }
    double mtf(String s){
        meters = 0;
        try{
            meters = Double.parseDouble(s);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
        meters*=3.2808399;
        return meters;
    }
    double ktp(String s){
        pounds = 0;
        try{
            pounds = Double.parseDouble(s);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
        pounds*=2.20462262;
        return pounds;
    }
    double ptk(String s){
        kilo = 0;
        try{
            kilo = Double.parseDouble(s);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
        kilo*=0.45359237;
        return kilo;
    }
}
