package tadasIvanauskas;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by hamekas on 10/14/16 @HKR ivanauskas15@gmail.com
 */
class Book {
    //FINAL so it could not be changed later
    private final String name;
    private final String[] authors;
    private final String isbn;
    private final double price;

    //Create a book
    Book(String name, String[] authors, double price, String isbn) {
        this.name = name;
        this.authors = authors;
        this.isbn = isbn;
        if (price > 0) {
            this.price = price;
        } else {
            JOptionPane.showMessageDialog(null, "Price cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            this.price = 0;
        }
    }

    @Override
    public String toString() {
        return "Name of the book: \"" + name + "\" Authors: " +
                Arrays.toString(authors) + "\n Price: " + price +
                " ISBN: " + isbn + "\n";
    }

    double getPrice() {
        return price;
    }

}
