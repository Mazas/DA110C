package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
public class Task11 extends Task {
    public Task11(){
        int a = 1;
        while (a<=100){
            System.out.println(a);
            a+=2;
        }
        for (int i=100; i>0; i-=2){
            System.out.println(i);
        }
        Main.main(null);
    }
}
