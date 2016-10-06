/**
 * Created by hamekas on 9/8/16.
 */
import java.util.Scanner;
public class task8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //1st solution

        System.out.print("Enter a date of birth as YYMMDD: ");
        int number = input.nextInt();
        int yy=number/10000;
        System.out.println(yy);
        int dd=number%100;
        int mm=(number/100)%100;
        System.out.println(mm);
        System.out.println(dd);
        //2nd solution
        System.out.println("Enter date of birth as YYMMDD: ");
        int a=input.nextInt();
        String b= String.valueOf(a).substring(4);
        System.out.println(b);

        //3rd solution
        System.out.print("Enter civic number: ");
        int[] arr = new int[6];
        int cNumb=input.nextInt();
        for (int i=0; i<arr.length;i++) {
            char x1 = String.valueOf(cNumb).charAt(i);
            int x = Character.getNumericValue(x1);
            arr[i] = x;
        }
        System.out.printf("%d%d%n",arr[2],arr[3]);

    }
}
