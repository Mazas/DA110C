package com.company;

/**
 * Created by hamekas on 9/22/16 @HKR.
 */
import java.util.Scanner;
public class Task9 {
    Scanner in = new Scanner(System.in);
    public double task9(double a, double b, double c){
        return (a*b)+c;
    }
    public void task11(){
         int[] arr = new int [10];
        for (int i = 0; i<10; i++){
            System.out.print("Enter a number: ");
                arr[i] = in.nextInt();
        }
        Task9 task = new Task9();
        task.task12(arr);
    }
    public void task12(int[]a){
        for (int i = 0; i<10; i++){
            System.out.printf("%d  ", a[i]);
        }
    }
}
