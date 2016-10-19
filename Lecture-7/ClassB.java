package tadasIvanauskas;

/**
 * Created by hamekas on 10/11/16 @HKR ivanauskas15@gmail.com
 */
public class ClassB extends ClassA {
    private String lastName;
    ClassB(){
        this(" "," ");
    }
    ClassB(String name, String lastName){
        super(name);
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

}
