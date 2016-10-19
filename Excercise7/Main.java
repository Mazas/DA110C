package tadasIvanauskas;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        ArrayList<Contacts> phoneBook = new ArrayList<>();
        while (!exit) {

            String choice = JOptionPane.showInputDialog(null, "1. New contacts" +
                    "\n2. Remove contacts\n3. View contacts\n" +
                    "4. Search contacts", "Menu", JOptionPane.PLAIN_MESSAGE);

            switch (choice) {
                //EXIT
                case "0":
                case "exit":
                case "x":
                    exit = true;
                    break;
                //NEW CONTACT
                case "1":
                    JTextField name = new JTextField();
                    JTextField lastName = new JTextField();
                    JTextField privateOrWork = new JTextField();
                    JTextField pnumber = new JTextField();

                    Object[] message ={
                            "Name: ",name,
                            "Last Name: ", lastName,
                            "Phone number: ",pnumber,
                            "Private contact?",privateOrWork,};

                    int option = JOptionPane.showConfirmDialog(null, message,
                            "New Contact",JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE);

                    if (option==JOptionPane.OK_OPTION){
                        //IF PRIVATE CONTACT
                        if (privateOrWork.getText().equalsIgnoreCase("yes")||
                                privateOrWork.getText().equalsIgnoreCase("y")){

                            phoneBook.add(new PrivateContacts(name.getText(),lastName.getText(),
                                    pnumber.getText(),
                                    JOptionPane.showInputDialog(null, "Enter the Nick Name",
                                            "Nickname",JOptionPane.PLAIN_MESSAGE)));
                        //IF WORK CONTACT
                        }else if (privateOrWork.getText().equalsIgnoreCase("no")||
                                privateOrWork.getText().equalsIgnoreCase("n")){

                            JTextField emp1 = new JTextField();
                            JTextField emp2 = new JTextField();
                            JTextField emp3 = new JTextField();

                            Object[] employers={
                                    "Enter the last 3 employers\n",
                                    "Employer 1:",emp1,
                                    "Employer 2:",emp2,
                                    "Employer 3:",emp3,};

                            option = JOptionPane.showConfirmDialog(null,employers,"Employers",
                                    JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);

                            if (option==JOptionPane.OK_OPTION){

                                String[] emps ={emp1.getText(),emp2.getText(),emp3.getText()};

                                phoneBook.add(new WorkContacts(emps,name.getText(),lastName.getText(),pnumber.getText()));
                            }
                        }
                    }
                    break;
                //REMOVE
                case "2":
                    name = new JTextField();
                    Object[] removeMessage ={
                            "To remove a contact, enter the name of the contact",name,};

                    option = JOptionPane.showConfirmDialog(null,removeMessage,"Remove",
                            JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);

                    if (option==JOptionPane.OK_OPTION) {
                        for (Contacts con : phoneBook) {

                            if (con instanceof PrivateContacts) {

                                if (con.getName().equalsIgnoreCase(name.getText()) ||
                                        ((PrivateContacts) con).getNickname().equalsIgnoreCase(name.getText())) {
                                    phoneBook.remove(con);
                                    break;
                                }
                                if (con.getName().equalsIgnoreCase(name.getText())) {
                                    phoneBook.remove(con);
                                }
                            }
                        }
                    }
                    break;
                //SHOW PHONEBOOK
                case "3":
                    option = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Show private contacts" +
                            "\n2. Show work contacts\n3. Show all contacts",JOptionPane.PLAIN_MESSAGE));

                    switch (option){
                        case 0:
                            break;
                        case 1:
                            phoneBook.stream().filter(Contacts::isPrivate).forEach(System.out::println);
                            break;
                        case 2:
                            phoneBook.stream().filter(contacts -> !contacts.isPrivate()).forEach(System.out::println);
                            break;
                        case 3:
                            phoneBook.forEach(System.out::println);
                            break;
                        default:
                            JOptionPane.showConfirmDialog(null,"No such case!","ERROR",JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                //SEARCH
                case "4":
                    name = new JTextField(null);
                    Object[] search={
                            "Enter a name of the contact you search for:",name};
                    while (name.getText().length()<2) {
                        option = JOptionPane.showConfirmDialog(null, search, "Search", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (option == JOptionPane.OK_OPTION) {
                            phoneBook.stream().filter(contacts ->
                                    contacts.toString().toLowerCase().contains(name.getText().toLowerCase()))
                                    .forEach(System.out::println);
                        }else if(option==JOptionPane.CANCEL_OPTION||option==JOptionPane.CLOSED_OPTION){
                            break;
                        }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No such task", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}

