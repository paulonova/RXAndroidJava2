package io.javabrains;

/** * Created by Paulo Vila Nova on 2017-05-01.
 */
public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World");
    }


}
