/**
 * Created by hamekas on 9/6/16.
 */
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        if (age>0)
            this.age = age;
        }

    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
}
