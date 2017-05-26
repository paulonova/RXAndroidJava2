package io.reactiveJava;

/** * Created by Paulo Vila Nova on 2017-05-03.
 */
public class LambdaAnonimousFunction {

    public static void main(String[] args) {

        System.out.println(giveMeBack(1));
        System.out.println(giveMeBack(1.4));
        System.out.println(giveMeBack("A"));
        System.out.println(giveMeBack("Hello"));
        System.out.println(giveMeBack(new Object()));

    }


    //Generic method
    private static<T> T giveMeBack(T a){
        return a;
    }



}
