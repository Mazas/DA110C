package com.company;

/**
 * Created by hamekas on 9/22/16 @HKR.
 */
public class Task4 extends Task{
        private int one;
        private int two;
    public String numbers(){
        String string = one + " and "+two;
        return string;

    }
    public void setNumbers(int one, int two){
        this.one = one;
        this.two = two;
    }
}
