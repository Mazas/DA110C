package tadasIvanauskas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean exit=false;
        while(!exit){
            String choice = JOptionPane.showInputDialog(null,"Enter the task","Task",JOptionPane.PLAIN_MESSAGE);
            switch (choice){
                case"0":
                    exit=true;
                    break;
                case"1":
                    Task person1 = new Task1("John","112233-4444",123345678,"streetname 123");
                    Task person2 = new Task1("Peter","113322-5555",12331212,"Streetname 112");
                    ArrayList<Task> people = new ArrayList<>();
                    people.add(person1);
                    people.add(person2);
                    people.forEach(System.out::println);
                    break;
                case"2":
                    Task employee1 = new Employee("John","112233-4444",123345678,"street name 123",-1);
                    Task employee2 = new Employee("Peter","113322-5555",12331212,"Street name 112",20000);
                    ArrayList<Task> employees = new ArrayList<>();
                    employees.add(employee1);
                    employees.add(employee2);
                    employees.forEach(System.out::println);
                    break;
                case"3":
                    Task employee4 = new Employee("Peter","113322-5555",12331212,"Streetname 112",20000);
                    Bank bank = new Bank(employee4);
                    boolean task3case = false;
                    while(!task3case) {
                        String task3Choice = JOptionPane.showInputDialog(null, bank.menu(), "Welcome", JOptionPane.PLAIN_MESSAGE);
                        switch (task3Choice){
                            case"0":
                                task3case = true;
                                break;
                            case"1":
                                bank.deposit(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter amount to deposit","Deposit",JOptionPane.PLAIN_MESSAGE)));
                                break;
                            case"2":
                                bank.withdraw(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount to withdraw","Withdraw",JOptionPane.PLAIN_MESSAGE)));
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null,bank.toString(),"Info",JOptionPane.PLAIN_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Invalid input","ERROR",JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }
                    break;
                case "4":
                    Scanner in = new Scanner(System.in);
                    Deck deck = new Deck();
                    deck.shuffleDeck();
                    ArrayList card;
                    card = deck.pickACard();
                    System.out.println("you picked: "+card);
                    deck.putACard(card);
                    deck.showDeck();
                    System.out.print("Enter the cards suit: ");
                    String suit = in.nextLine().trim();
                    System.out.print("Enter the rank of the card: ");
                    String rank = in.nextLine().trim();
                    Deck card1 = new Deck(suit,rank);
                    card1.showDeck();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Invalid input","ERROR",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
