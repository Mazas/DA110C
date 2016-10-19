package tadasIvanauskas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    	boolean exit = false;
        String choice = "";
        while (!exit){
            choice = JOptionPane.showInputDialog(null,"Choose a task","");
            switch (choice){
                case"0":
                case"exit":
                    exit=true;
                    break;
                case"1":

                    ClassB classB=new ClassB(JOptionPane.showInputDialog(null,"Enter your name"),
                            JOptionPane.showInputDialog(null,"Enter your last name"));
                    JOptionPane.showMessageDialog(null,"Name: "+classB.getName()+
                            "\nLast Name: "+classB.getLastName());
                    break;
                case"2":
                        JOptionPane.showMessageDialog(null,
                                myMath.cube(Double.parseDouble(
                                        JOptionPane.showInputDialog(null,"Enter the size of the cube"))));
                    break;
                case"3":
                    Months months = new Months();
                    months.setMonth(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the month \n1-12")));
                    JOptionPane.showMessageDialog(null,months.getMonth());
                    break;
                case"4":
                    Car car = new Car();
                    Car car1 = new Car(2003);
                    Car car2 = new Car(2014,"Volvo");
                    JOptionPane.showMessageDialog(null,car.toString()+"\n\n"+
                            car1.toString()+"\n\n"+car2.toString(),"Cars",JOptionPane.PLAIN_MESSAGE);
                    break;
                case"5":
                    Person person = new Person();
                    person.setName(JOptionPane.showInputDialog(
                            null,"Enter the name","Name",JOptionPane.PLAIN_MESSAGE));
                    person.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age","Age"
                                    ,JOptionPane.PLAIN_MESSAGE)));
                    Person person2 = new Person();
                    person2.setName(JOptionPane.showInputDialog(
                            null,"Enter the name","Name",JOptionPane.PLAIN_MESSAGE));
                    person2.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age","Age"
                            ,JOptionPane.PLAIN_MESSAGE)));
                    JOptionPane.showMessageDialog(null,person.toString()+"\n"+person2.toString(),"People",JOptionPane.PLAIN_MESSAGE);
                    break;
                case"6":
                    Person person3 = new Person(JOptionPane.showInputDialog(
                            null,"Enter the name","Name",JOptionPane.PLAIN_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age","Age"
                                    ,JOptionPane.PLAIN_MESSAGE)));
                    Person person4 = new Person(JOptionPane.showInputDialog(
                            null,"Enter the name","Name",JOptionPane.PLAIN_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age","Age"
                                    ,JOptionPane.PLAIN_MESSAGE)));
                    JOptionPane.showMessageDialog(null,person3.toString()+"\n"+person4.toString(),"People",JOptionPane.PLAIN_MESSAGE);
                    break;
                case"7":
                    Person person5 = new Person(JOptionPane.showInputDialog(
                            null,"Enter the name","Name",JOptionPane.PLAIN_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the age","Age"
                                    ,JOptionPane.PLAIN_MESSAGE)),
                            JOptionPane.showInputDialog(null,"Enter motto","Motto",JOptionPane.PLAIN_MESSAGE));
                    JOptionPane.showMessageDialog(null,person5.toString(),person5.getName(),JOptionPane.PLAIN_MESSAGE);
                    break;
                case"8":
                    Person student = new Student(
                            JOptionPane.showInputDialog(null,"Enter name","Name",JOptionPane.PLAIN_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter age","Age",JOptionPane.PLAIN_MESSAGE)),
                            JOptionPane.showInputDialog(null,"Enter motto","Motto",JOptionPane.PLAIN_MESSAGE),
                            JOptionPane.showInputDialog(null,"Enter grade","Grade",JOptionPane.PLAIN_MESSAGE).charAt(0)
                    );
                    JOptionPane.showMessageDialog(null,student.toString(),student.getName(),JOptionPane.PLAIN_MESSAGE);
                    break;
                case"9":
                    Person student1 = new Student(
                            JOptionPane.showInputDialog(null,"Enter name","Name",JOptionPane.PLAIN_MESSAGE),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter age","Age",JOptionPane.PLAIN_MESSAGE)),
                            JOptionPane.showInputDialog(null,"Enter motto","Motto",JOptionPane.PLAIN_MESSAGE),
                            JOptionPane.showInputDialog(null,"Enter grade","Grade",JOptionPane.PLAIN_MESSAGE).charAt(0),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Enter month","Month",JOptionPane.PLAIN_MESSAGE))
                    );
                    JOptionPane.showMessageDialog(null,student1.toString(),student1.getName(),JOptionPane.PLAIN_MESSAGE);

                default:
                    JOptionPane.showMessageDialog(null,"Invalid input","Warning",JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}
