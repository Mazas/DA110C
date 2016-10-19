package tadasIvanauskas;

/**
 * Created by hamekas on 10/11/16 @HKR ivanauskas15@gmail.com
 */
public class Car {

    private int year;
    private String brand;
    Car(){
        this(0);
    }
    Car(int year){
        this(year," ");
    }
    Car(int year, String brand){
        this.year=year;
        this.brand=brand;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }
    @Override
    public String toString(){
        return "Year: "+getYear()+"\nBrand: "+getBrand();
    }
}
