package tadas.ivanauskas;

/**
 * Created by hamekas on 9/29/16 @HKR ivanauskas15@gmail.com
 */
import java.util.Scanner;
class extra {
    extra() {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String original = in.nextLine();
        String code ="";
        original=original.toUpperCase();
        String abc="ABCDEFGHIKLMNOPQRSTVXYZAB";
        int len = original.length();
        for (int i = 0;i<len;i++){
            code=code+abc.charAt(abc.indexOf(original.charAt(i))+2);
        }
        System.out.print(code);

    }
}
