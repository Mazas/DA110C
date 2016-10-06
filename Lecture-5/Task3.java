package com.company;

/**
 * Created by hamekas on 9/22/16 @HKR.
 */
public class Task3 extends Task {
    String string = "";
    static String line1(){
        return "Enter the string:";
    }
    void setString(String string){
        this.string = string;
    }
    String getString(){
        return string;
    }
}
