package com.company;

/**
 * Created by hamekas on 9/15/16 @HKR @HKR.
 */
class Bank {
    private String name = "";
    private String address = "";
    private int pnum = 0;
    private int money;
    void setName(String name){
        this.name = name;
    }
    void setAddress(String address){
        this.address= address;
    }
    void setPnum(int pnum){
        this.pnum = pnum;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    int getPnum(){
        return pnum;
    }
    int getMoney(){
        return money;
    }
    void setMoney(int money){
        this.money= money;
    }
    public String toString(){
        String result= "------------------------------\n"+
                "Your name: " +getName()+"\n"+
                "Your address: " +getAddress()+"\n"+
                "Your personal number: " +getPnum()+"\n"+
                "Your balance is: " +getMoney()+"\n"+
                "------------------------------\n";
        return result;
    }

}
