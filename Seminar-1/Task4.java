package Seminar1;

/**
 * Created by hamekas on 9/11/16.
 */
import java.util.Scanner;
public class Task4 extends Task {
    public Task4() {
        int students = 0;
        int grade = -1;
        int a = 0;
        int b = 0;
        int c = 0;
        int f = 0;
        String ans = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Hello to a grade calculator!");
        while (!(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n"))) {
           while (students<=0){
            System.out.print("Enter the the amount of students: ");
            String sStudents = in.nextLine().trim();
            try {
                students=Integer.parseInt(sStudents);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
           }
           Student:
           /*
           *Could not figure out how to handle exception if
           *String is entered instead of integer
           */
            for (int i = students; i > 0; i--) {
                while (grade<0) {
                    System.out.print("Enter the score 0-40: ");
                    String score = in.nextLine().trim();
                    try {
                        grade = Integer.parseInt(score);
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        break Student;
                    }
                }
                if (grade < 0 || grade > 40) {
                    System.out.println("Invalid input!");
                    break Student;
                } else {
                    if (grade>=30&& grade<36){grade=4;}
                    else if(grade>35){grade=5;}
                    else {grade/=10;}
                    switch (grade) {
                        case 0:
                        case 1:
                            System.out.println("U");
                            f++;
                            break;
                        case 2:
                            System.out.println("3");
                            c++;
                            break;
                        case 4:
                            System.out.println("4");
                            b++;
                            break;
                        case 5:
                            System.out.println("5");
                            a++;
                            break;
                        default: break;
                    } grade= -1;
                }
            }
            System.out.format("U: %d students %d%%%n" +
                    "3: %d students %d%%%n" +
                    "4: %d students %d%%%n" +
                    "5: %d students %d%%%n", f, (f*100)/students, c,(c*100)/students,
                    b,(b*100)/students, a,(a*100)/students);
                System.out.printf("%nDo you want to repeat? y/n: ");
                ans = in.nextLine().trim();
                if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                    students = 0;
                    grade = -1;
                    a = 0;
                    b = 0;
                    c = 0;
                    f = 0;
                } else if (ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
                    Main.main(null);
                    System.exit(0);
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }
    }
