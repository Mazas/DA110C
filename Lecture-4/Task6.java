package Lecture4;

/**
 * Created by hamekas on 9/12/16.
 */
public class Task6 extends Task {
    public Task6(){
        System.out.println("For loop");
        for (int i=0; i<10; i++){
            System.out.println("Hello world");
        }
        System.out.println("While loop");
        int i = 0;
        while (i<10){
            System.out.println("Hello world");
            i++;
        }
        i=0;
        System.out.println("Do - While loop");
        do {
            System.out.println("Hello world");
            i++;}
            while (i<10);

        Main.main(null);
    }
}
