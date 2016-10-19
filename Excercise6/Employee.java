package tadasIvanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 10/13/16 @HKR ivanauskas15@gmail.com
 */
public class Employee extends Task1 {
    private double salary;
    Employee(){
        this(0);
    }
    Employee(double salary){
        super("","",0,"");
        this.salary=salary;
    }
    Employee(String name,String ssn,int pnum,String address,double salary){
        super(name, ssn, pnum, address);
        if (salary<0){
            JOptionPane.showMessageDialog(null,"Salary cannot be negative!","You bastard!",JOptionPane.ERROR_MESSAGE);
        }else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            JOptionPane.showMessageDialog(null,"Salary cannot be negative!","You bastard!",JOptionPane.ERROR_MESSAGE);
        }else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee: "+super.toString()+" salary: "+salary;
    }
}
