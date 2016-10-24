package tadasIvanauskas;

/**
 * Created by hamekas on 10/15/16 @HKR ivanauskas15@gmail.com
 */
class BankBags {
    private int size=0;

    //BAGS
    BankBags(int length, int width, int height){
        size=length*width*height;
    }

    int getBags(){
        return size;
    }

}
