package Seminar1;

/**
 * Created by hamekas on 9/11/16.
 */
import java.util.Scanner;
public class Task3 extends Task {
    public Task3() {
        int rows = 0;
        int columns = 0;
        Scanner in = new Scanner(System.in);
        String token = "";
        while (!token.equalsIgnoreCase("no")||!token.equalsIgnoreCase("n")) {

            while (rows <= 0) {
            System.out.print("Enter the number of rows:");
            String sRows = in.nextLine().trim();
            try {
                rows = Integer.parseInt(sRows);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        while (columns <= 0) {
            System.out.print("Enter the number of columns");
            String scolumns = in.nextLine().trim();
            try {
                columns = Integer.parseInt(scolumns);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        for (int i=rows; i>0; i--){
            System.out.println();
            for (int j = columns; j>0; j--){
                System.out.print("X");
            }
        }
             System.out.printf("%nDo you want to repeat? y/n: ");
            token = in.nextLine().trim();
            if (token.equalsIgnoreCase("yes") || token.equalsIgnoreCase("y")) {
                rows = 0;
                columns =0;
                continue;
            } else if (token.equalsIgnoreCase("no") || token.equalsIgnoreCase("n")) {
                Main.main(null);
                System.exit(0);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
