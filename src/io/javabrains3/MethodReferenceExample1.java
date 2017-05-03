package io.javabrains3;

/** * Created by Paulo Vila Nova on 2017-05-03.
 */
public class MethodReferenceExample1 {

    public static void main(String[] args){

        //Lambda expression..
        Thread thread = new Thread(() -> printMessage());
        thread.start();

        //Method reference..
        Thread t = new Thread(MethodReferenceExample1 :: printMessage); // MethodReferenceExample1 :: printMessage   == () -> printMessage()
        t.start();


    }

    public static void printMessage(){
        System.out.println("Hello Mamma!");
    }

}
