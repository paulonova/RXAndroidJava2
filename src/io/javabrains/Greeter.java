package io.javabrains;

/** * Created by Paulo Vila Nova on 2017-05-01.
 */
public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();


        Greeting lambdaGreeting = () ->  System.out.println("Hello World 1");

        //Implementation of an Interface..
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World 2");
            }
        };


        lambdaGreeting.perform();           //Lambda expression
        innerClassGreeting.perform();       // Inner class

//        greeter.greet(lambdaGreeting);
        greeter.greet(() ->  System.out.println("Hello World 1"));
        greeter.greet(innerClassGreeting);

    }

}
