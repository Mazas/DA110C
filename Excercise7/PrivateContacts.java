package tadasIvanauskas;

/**
 * Created by hamekas on 10/17/16 @HKR ivanauskas15@gmail.com
 */
public class PrivateContacts extends Contacts{
    private String nickname;

    PrivateContacts(){
        this(null,null,null,null);
    }
    PrivateContacts(String name,String lastName,String number,String nickname){
        super(name,lastName,number);
        this.nickname=nickname;
    }
    String getNickname(){
        return nickname;
    }
    void setNickname(String nick){
        this.nickname=nick;
    }
    public boolean isPrivate(){
        return true;
    }
    public String toString(){
        return super.toString()+"\nNickname: "+nickname+"\n";
    }
}
