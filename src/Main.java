import java.util.*;

/**
 * Created by Paulo Vila Nova on 2017-04-15.
 */
public class Main {


    public static void main(String[] args) {

        Tutorial android1 = new Tutorial("Hafiz 1", "........");
        android1.publish();
        Tutorial android2 = new Tutorial("Hafiz 2", "........");
        android2.publish();
        Tutorial android3 = new Tutorial("Hafiz 3", "........");
        android3.publish();

        // I have already three tutorials and later user subscribed for email
        User A = new User("A", "a@a.com");
        User B = new User("B", "b@a.com");
        User C = new User("C", "c@a.com");
        User D = new User("D", "d@a.com");

        // Now A,C and D click subscribe button


        Tutorial.REGISTER_FOR_SUBSCRIPTION.subscribe(A);  //subscribe is from Rx lib.
        Tutorial.REGISTER_FOR_SUBSCRIPTION.subscribe(C);
        Tutorial.REGISTER_FOR_SUBSCRIPTION.subscribe(D);

        Tutorial android4 = new Tutorial("Hafiz 4", "........");
        android4.publish();


        /** ***********************************************************************************************************/


    }


//    public static void sendEmail(User user) {
//        System.out.println("Email send: " + user.getName());
//    }


}
