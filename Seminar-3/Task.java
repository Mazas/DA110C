package tadasIvanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 10/14/16 @HKR ivanauskas15@gmail.com
 */
class Task {
    //method to check if input is a number
    boolean isNumber(String string){
        char[] achar=string.trim().toCharArray();
        char[] numbers={'0','1','2','3','4','5','6','7','8','9','-','+'};
        int count=0;
        for (char bchar:achar){
            for (char numb:numbers){
                if (bchar==numb){
                    count++;
                }
            }
        }
        return count==achar.length;
    }
    //methods to show an error
    public void error(){
        JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
    }
    void error(String errorMessage){
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
