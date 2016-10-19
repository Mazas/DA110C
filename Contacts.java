package tadasIvanauskas;

/**
 * Created by hamekas on 10/17/16 @HKR ivanauskas15@gmail.com
 */
public class Contacts {
    private String name;
    private String lastName;
    private String number;
    Contacts(){
        this(null,null,null);
    }
    Contacts(String name, String lastName,String number){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
    }
    String getName(){
        return name;
    }
    String getLastName(){
        return lastName;
    }
    String getNumber(){
        return number;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nLast Name: "+lastName+
                "\nPhone number: "+number;
    }
    boolean isPrivate(){
        return false;
    }
}
