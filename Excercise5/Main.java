package tadas.ivanauskas;
import javax.swing.*;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String choice = "";
        Main task = new Main();
        while (!(choice.equalsIgnoreCase("exit") || choice.equalsIgnoreCase("1"))) {
            choice = JOptionPane.showInputDialog(null, "Enter the task.");
            switch (choice) {
                case "0":
                    System.exit(0);
                case "1":
                    task.task1();
                    break;
                case "2":
                    task.task2();
                    break;
                case "3":
                    task.task3();
                    break;
                case "4":
                    task.task4();
                    break;
                case "5":
                    task.task5();
                    break;
                case "6":
                    task.task6();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Your input is invalid.");
                    break;

            }
        }
    }

    private void task1() {
        String[] months = new String[12];
        for (int i = 0; i < months.length; i++) {
            months[i] = Month.of(i + 1).toString();
        }
        for (String month : months) {
            if (month.equalsIgnoreCase("April")) {
                System.out.println(month + " BEST MONTH EVER!!!");
            } else {
                System.out.println(month);
            }
        }
    }

    private void task2() {
        int[] num = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            if (i == num[i] - 1) {
                System.out.print(num[i] + " ");
            } else {
                System.out.println("\nNumber " + (i + 1) + " is missing.");
                break;
            }

        }
    }

    private void task3() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = Math.abs(Integer.parseInt(in.nextLine().trim()));
        }
        int temp1 = 0;
        int temp2 = 0;
        Arrays.sort(arr);
        int distance = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (distance > arr[i + 1] - arr[i]) {
                distance = arr[i + 1] - arr[i];
                temp2 = arr[i];
                temp1 = arr[i + 1];
            }
        }
        System.out.println(temp1 + "-" + temp2 + "=" + distance);
    }

    private void task4() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number: ");
            arr.add(Integer.parseInt(in.nextLine().trim()));
        }
        int smallest = arr.get(0);
        int largest = arr.get(0);
        double median = 0;
        for (int i : arr) {
            if (smallest > i) {
                smallest = i;
            } else if (largest < i) {
                largest = i;
            }
            median += i;
        }
        median = median / arr.size() - 1;
        System.out.print("Smallest is: " + smallest + " Largest is " + largest + " Median of array is: " + median);
    }

    private void task5() {
        ArrayList<String> names = new ArrayList<>();
        names.add("tadas");
        names.add("fatih");
        names.add("tomas");
        names.add("cristina");
        names.add("kalle");
        System.out.print("Enter the letter to be found: ");
        char letter = in.nextLine().toLowerCase().charAt(0);
        for (String i : names) {
            char[] chars = i.toCharArray();
            if (chars[0] == letter) {
                System.out.println(i + " Starts with " + letter);
            } else {
                for (char a : chars) {
                    if (a == letter) {
                        System.out.println(i + " Contains " + letter);
                    }
                }
            }
        }
    }

    private void task6() {
        double balance = 0;
        double amount;
        double[] history = new double[10];
        int index = 0;
        String confirm;
        boolean exit = false;
        while (!exit) {
            confirm = JOptionPane.showInputDialog(null, "----Welcome to our bank----\n" +
                    "Enter the positive amount to deposit, negative to withdraw.\n" +
                    "Enter exit to exit").trim();
            if (confirm.equalsIgnoreCase("exit")) {
                if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,"Do you really want to exit?")) {
                    exit = true;
                    String historyExit="";
                    for (double i : history) {
                        historyExit+=i + " ";
                    }
                    System.out.println(historyExit+" "+balance);
                    break;
                }
            }

            if (!Main.isNumber(confirm)) {
                JOptionPane.showMessageDialog(null,"Not a number.");
                continue;
            }
            amount = Double.parseDouble(confirm);
            balance = +amount;
            System.out.println(balance);
            if (index < 10) {
                history[index++] = amount;
            }else{
                index=0;
                history[index++]=amount;
            }
        }
    }
    private static boolean isNumber(String string){
        char[] conf = string.toCharArray();
        int count=0;
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '+', '.'};
        for (char aConf : conf) {
            for (char digit : digits) {
                if (aConf == digit) {
                    count++;
                    break;
                }
            }
        }
        return conf.length == count;
    }
}
