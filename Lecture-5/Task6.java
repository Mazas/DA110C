package com.company;

/**
 * Created by hamekas on 9/22/16 @HKR.
 */

import java.util.Scanner;

public class Task6 extends Task {
    private int number;
    Scanner in = new Scanner(System.in);

    int number() {
        System.out.print("Enter a number: ");
        number = in.nextInt();
        return number;
    }
}

