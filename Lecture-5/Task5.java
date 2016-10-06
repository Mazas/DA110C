package com.company;

/**
 * Created by hamekas on 9/22/16 @HKR.
 */
public class Task5 extends Task {
    private double firstDouble;
    private double secondDouble;
    private double thirdDouble;
    public void setNumbers(double a, double b, double c){
        this.firstDouble = a;
        this.secondDouble = b;
        this.thirdDouble = c;
    }
    public double getFirstDouble(){
        return firstDouble;
    }
    public double getSecondDouble(){
        return secondDouble;
    }
    public double getThirdDouble(){
        return thirdDouble;
    }
}
