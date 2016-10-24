package tadasIvanauskas;

/**
 * Created by hamekas on 10/15/16 @HKR ivanauskas15@gmail.com
 */
public class Phone {
    private String name;
    private String number;
    Phone(){}
    //constructor for a new call
    Phone(String name, String number){
        this.name=name;
        this.number=number;
    }
    //method to show a menu
    String menu(){
        return "-----Welcome-----\n1. New Call\n" +
                "2. Answer Call"+
                "\n3. Current Call\n4. Call Queue\n" +
                "5. Close Call\n0. Exit";
    }
    //show the call
    @Override
    public String toString(){
        return "Name: "+name+" Number: "+number+"\n";
    }

}
