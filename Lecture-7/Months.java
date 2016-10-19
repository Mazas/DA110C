package tadasIvanauskas;
import javax.swing.*;

/**
 * Created by hamekas on 10/11/16 @HKR ivanauskas15@gmail.com
 */
public class Months {
    enum Month{JANUARY, FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}
    private Month month;
    public Months(){
        this(Month.JANUARY);
    }
    public Months(Month month){
        this.month=month;
    }
    public void setMonth(int i){
        switch (i){
            case 1:
                this.month=Month.JANUARY;
                break;
            case 2:
                this.month=Month.FEBRUARY;
                break;
            case 3:
                this.month=Month.MARCH;
                break;
            case 4:
                this.month=Month.APRIL;
                break;
            case 5:
                this.month=Month.MAY;
                break;
            case 6:
                this.month=Month.JUNE;
                break;
            case 7:
                this.month=Month.JULY;
                break;
            case 8:
                this.month=Month.AUGUST;
                break;
            case 9:
                this.month=Month.SEPTEMBER;
                break;
            case 10:
                this.month=Month.OCTOBER;
                break;
            case 11:
                this.month=Month.NOVEMBER;
                break;
            case 12:
                this.month=Month.DECEMBER;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid month","ERROR", JOptionPane.WARNING_MESSAGE);
                break;


        }
    }
    public Month getMonth(){
        return month;
    }
}

