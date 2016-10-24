package tadasIvanauskas;

import javax.swing.*;

/**
 * Created by hamekas on 10/14/16 @HKR ivanauskas15@gmail.com
 */
class Task1 extends Task {
    void task1start() {
        String sName = "";
        String[] author = {};
        String sIsbn = "";
        double iPrice = 0;
        //object for a message
        JTextField name = new JTextField();
        JTextField authors = new JTextField();
        JTextField price = new JTextField();
        JTextField isbn = new JTextField();

        Object[] message = {
                "Name: ", name,
                "Authors: ", authors,
                "Price: ", price,
                "ISBN: ", isbn
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Enter Info",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //if OK is clicked bet values from input
        if (option == JOptionPane.OK_OPTION) {
            sName = name.getText().trim();
            //Split string of authors at ',' and store it in an array
            author = authors.getText().trim().split(",");
            iPrice = Double.parseDouble(price.getText().trim());
            sIsbn = isbn.getText().trim();
        }
        //make book objects
        Book book = new Book(sName, author, iPrice, sIsbn);
        //we could create new objects by repeating input
        //but i decided to make one from input and make 2 objects manually
        Book book1 = new Book("Awesome book", author, 150, "ISBN-xxxxxxxxxx");
        Book book2 = new Book("Awesome book#3", author, 200, "ISBN-xxxxxxxxx3");
        //show total cost of 3 books
        JOptionPane.showMessageDialog(null, "Total cost of 3 books:\n" + (book.getPrice() + book1.getPrice() +
                book2.getPrice()), "Total cost", JOptionPane.PLAIN_MESSAGE);
        //show these 3 books
        JOptionPane.showMessageDialog(null, "Selected books are:\n" + book.toString() + "\n" + book1.toString() +
                "\n" + book2.toString(), "Selected books", JOptionPane.PLAIN_MESSAGE);
    }
}