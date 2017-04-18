import rx.functions.Action1;

import java.util.List;
import java.util.Observer;

/** * Created by Paulo Vila Nova on 2017-04-15.
 */
public class User implements Action1 {

    private String name;
    private String email;

    public User(){

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public static void sendEmail(User user){
        System.out.println("Email send: "+user.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public void call(Object o) {
        sendEmail(this);
    }
}
