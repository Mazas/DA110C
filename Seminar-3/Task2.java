package tadasIvanauskas;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by hamekas on 10/14/16 @HKR ivanauskas15@gmail.com
 */
class Task2 extends Task {


    void task2start() {
        boolean exit = false;
        //ArrayList of tickets
        ArrayList<Tickets> tickets = new ArrayList<>();
        //Menu
        String menu = "-----Welcome-----\n1. Open new ticket\n" +
                "2. View open tickets\n3. View closed tickets\n" +
                "4. View all tickets\n5. Get ticket by ID" +
                "\n6. Close tickets\n0. Exit";
        while (!exit) {
            //Input
            String choice = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.PLAIN_MESSAGE);
            switch (choice) {
                case "0":
                case "x":
                case "exit":
                    exit = true;
                    break;
                //New ticket
                case "1":
                    //Message
                    JTextField name = new JTextField();
                    JTextField issue = new JTextField();
                    Object[] ticketMessage = {
                            "Your name:", name,
                            "Describe your issue:", issue,};
                    int option = JOptionPane.showConfirmDialog(null,
                            ticketMessage, "New Ticket", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE);
                    //if ok is clicked, take values and make a new ticket
                    if (option == JOptionPane.OK_OPTION) {
                        tickets.add(new Tickets(name.getText().trim(), issue.getText().trim()));
                    }
                    break;
                case "2":
                    //Open tickets      IF TICKET IS NOT MARKED AS SOLVED
                    tickets.stream().filter(ticket -> !ticket.getStatus()).forEach(System.out::println);
                    break;
                case "3":
                    //Closed tickets    IF TICKED IS MARKED AS SOLVED
                    tickets.stream().filter(Tickets::getStatus).forEach(System.out::println);
                    break;
                case "4":
                    //Show ALL tickets
                    tickets.forEach(System.out::println);
                    break;
                case "5":
                    //GET ticket by ID
                    int ticketID;
                    //get id from input
                    String sTicketID = JOptionPane.showInputDialog(null, "Enter ticket ID", "Search",
                            JOptionPane.PLAIN_MESSAGE);
                    //if input is number, get the ticket ID as integer
                    if (isNumber(sTicketID)){
                        ticketID=Integer.parseInt(sTicketID);
                    }else{
                        //else show error
                        super.error();
                        break;
                    }
                    //Check all tickets for matching ID
                    boolean match = false;
                    for (Tickets ticket : tickets) {
                        if (ticket.getId() == ticketID) {
                            //IF match is found, STOP
                            match = true;
                            break;
                        }
                    }
                    //if the mach is found, show the ticked with matching ID
                    if (match) {
                        tickets.stream().filter(ticket -> ticket.getId() == ticketID).forEach(System.out::println);
                    } else {
                        //IF match is not found, show an error
                        super.error("No such ticket");
                    }
                    break;

                case "6":
                    //Close the ticket

                    //Message to show
                    JTextField ticketid = new JTextField();
                    JTextField comment = new JTextField();
                    Object[] closeMessage = {
                            "Enter ticket ID: ", ticketid, "Enter comment: ", comment,};
                    option = JOptionPane.showConfirmDialog(null, closeMessage, "Closing Ticket",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    //IF ok is clicked
                    if (option == JOptionPane.OK_OPTION) {
                        match = false;
                        //Get ticket ID from input, look for match
                        for (Tickets ticket : tickets) {
                            if (isNumber(ticketid.getText())) {
                                if (ticket.getId() == Integer.parseInt(ticketid.getText())) {
                                    match = true;//if match is found
                                    break;//stop looking
                                }
                                //if match is not found, show an error
                            }else {error();}
                        }
                        //IF match is found, get the ticket with that ID, close it and post a comment
                        if (match) {
                            tickets.stream().filter(tickets1 -> tickets1.getId() == Integer.parseInt(
                                    ticketid.getText().trim())).forEach(tickets1 -> tickets1.closeTicket(comment.getText()));
                        }else {
                            //if match is not found, show error
                            error("No such ticket");
                        }
                        break;
                    }
                default:
                    super.error();
                    break;

            }

        }
    }
}
