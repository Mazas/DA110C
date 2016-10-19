package tadasIvanauskas;

/**
 * Created by hamekas on 10/13/16 @HKR ivanauskas15@gmail.com
 */
public class Task1 extends Task {
    private String name;
    private String ssn;
    private int pnum;
    private String address;
    public Task1(){
        this("","");
    }
    public Task1(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public Task1(String name, String ssn, int pnum) {
        this.name = name;
        this.ssn = ssn;
        this.pnum = pnum;
    }

    public Task1(String name, String ssn, int pnum, String address) {
        this.name = name;
        this.ssn = ssn;
        this.pnum = pnum;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public int getPnum() {
        return pnum;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Task1: name: "  + name+
                " ssn: " + ssn+
                " phone number: " + pnum +
                " address: " + address;
    }
}
