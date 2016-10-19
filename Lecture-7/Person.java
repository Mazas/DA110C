package tadasIvanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 10/11/16 @HKR ivanauskas15@gmail.com
 */
public class Person {
    private String name;
    private int age;
    private String motto;
    Person(){
        this("");
    }
    Person(String name){
        this(name,0);
    }
    Person(String name,int age){
        this(name,age,"");

    }
    Person(String name,int age, String motto){
        this.motto=motto;
        if (age<0){
            JOptionPane.showMessageDialog(null,"Invalid age","ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0){
            JOptionPane.showMessageDialog(null,"Invalid age","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        this.age = age;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name: " + name +
                ", age: " + age+
                ", motto: "+motto;
    }
}
