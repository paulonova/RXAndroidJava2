package io.javabrains;

/** * Created by Paulo Vila Nova on 2017-05-02.
 */
public class RunnableExample {

    /**
     * Remember that it works because Runnable has a single abstract method.*/

    public static void main(String[] args) {


        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable 1");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> {System.out.println("Printed inside Runnable 2");
            System.out.println("Printed inside Runnable 3");} );

        myLambdaThread.run();

    }


}
