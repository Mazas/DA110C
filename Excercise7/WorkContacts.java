package tadasIvanauskas;


/**
 * Created by hamekas on 10/17/16 @HKR ivanauskas15@gmail.com
 */
public class WorkContacts extends Contacts {
    private String[] employers = new String[3];
    WorkContacts() {
        this(null, null, null, null);
    }

    WorkContacts(String[] employers, String name, String lastName, String number) {
        super(name, lastName, number);
        this.employers = employers;
    }

    String getEmployers() {
        String emp = "";
        for (String e : employers) {
            emp = emp + " " + e;
        }
        return emp;
    }
    @Override
    public String toString(){
        return super.toString()+"\nEmployers: "+getEmployers()+"\n";
    }
    boolean isPrivate(){
        return false;
    }
}

