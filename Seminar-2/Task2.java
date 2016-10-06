package tadas.ivanauskas;

/**
 * Created by hamekas on 9/23/16 @HKR @HKR ivanauskas15@gmail.com
 */
class Task2 {

    String task2(String string, double start, double rate){
        rate /= 100;
        return string+"Interest rate:  "+rate+" After a year you would have:  "+((start*rate)+start+"\n\n");
    }
}