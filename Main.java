package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice = "";
        Scanner in = new Scanner(System.in);
        while (!(choice.equalsIgnoreCase("exit"))) {
            System.out.printf("%n--------------------------------------%n" +
                    "Enter the number of task 1-14%nWrite exit to exit:");
            int intChoice = 0;
            choice = in.nextLine().trim();
            if (!(choice.equalsIgnoreCase("exit"))) {
                try {
                    intChoice = Integer.parseInt(choice);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                    continue;
                }
            }
            Task task;
            if (!(choice.equalsIgnoreCase("exit"))) {
                switch (intChoice) {
                    case 1:
                        System.out.print(Task1.helloWorld());
                        break;
                    case 2:
                        for (int i = 1; i <= 10; i++) {
                            System.out.printf(Task2.string());
                            System.out.println();
                        }
                        break;
                    case 3:
                        Task3 task3 = new Task3();
                        System.out.print(Task3.line1() + ": ");
                        String string = in.nextLine().trim();
                        task3.setString(string);
                        System.out.println("Your String is:");
                        System.out.println(task3.getString());
                        break;
                    case 4:
                        Task4 task4 = new Task4();
                        System.out.print("Enter first number: ");
                        int one = in.nextInt();
                        System.out.print("Enter second number: ");
                        int two = in.nextInt();
                        task4.setNumbers(one, two);
                        System.out.println("The numbers were: "+task4.numbers());
                        in.nextLine();
                        break;
                    case 5:
                        Task5 task5 = new Task5();
                        System.out.print("Enter the first number(you can use real numbers): ");
                        double one1 = in.nextDouble();
                        System.out.print("Enter the second number(you can use real numbers): ");
                        double two1 = in.nextDouble();
                        System.out.print("Enter the third number(you can use real numbers): ");
                        double three= in.nextDouble();
                        task5.setNumbers(one1, two1, three);
                        System.out.printf("Your numbers were: %.2f %.2f %.2f%n", task5.getFirstDouble(),
                                task5.getSecondDouble(), task5.getThirdDouble());
                        System.out.println(task5.getFirstDouble());
                        System.out.println(task5.getSecondDouble());
                        System.out.println(task5.getThirdDouble());
                        in.nextLine();
                        break;
                    case 6:
                        Task6 task6 = new Task6();
                        System.out.print(task6.number());
                        break;
                    case 7:
                        Task7 task7 = new Task7();
                        System.out.print("Enter a number: ");
                        one = in.nextInt();
                        System.out.print("Enter a second number: ");
                        two = in.nextInt();
                        System.out.println(task7.add(one, two));
                        in.nextLine();
                        break;
                    case 8:
                        task7 = new Task7();
                        System.out.print("Enter a number: ");
                        one1 = in.nextDouble();
                        System.out.print("Enter a second number: ");
                        two1 = in.nextDouble();
                        System.out.println(task7.add(one1, two1));
                        in.nextLine();
                        break;
                    case 9:
                        Task9 task9 = new Task9();
                        System.out.print("Enter the first number(you can use real numbers): ");
                        one1 = in.nextDouble();
                        System.out.print("Enter the second number(you can use real numbers): ");
                        two1 = in.nextDouble();
                        System.out.print("Enter the third number(you can use real numbers): ");
                        three= in.nextDouble();
                        System.out.println(task9.task9(one1, two1, three));
                    case 10:
                        task9= new Task9();
                        task9.task11();
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;

                }
            }
        }
    }
}

