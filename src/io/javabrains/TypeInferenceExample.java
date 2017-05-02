package io.javabrains;

/** * Created by Paulo Vila Nova on 2017-05-02.
 */
public class TypeInferenceExample {


    public static void main(String[] args) {

//        StringLengthLambda myLambda = s -> s.length();  //I don´t need to use (String s) and the () if I have just one parameter, because the interface gives me this. Just s.
//        System.out.println(myLambda.getLength("Hello Lambda"));
        printLambda(s -> s.length());

        Suma suma = a -> a*2;
        System.out.println("Value: " + suma.plus(5));

    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));

    }


    interface StringLengthLambda{
        int getLength(String s);
    }

    interface Suma{
        int plus(int a);
    }


}
