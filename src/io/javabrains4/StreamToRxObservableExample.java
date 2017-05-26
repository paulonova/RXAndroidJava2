package io.javabrains4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/** * Created by Paulo Vila Nova on 2017-05-04.
 */
public class StreamToRxObservableExample {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        list.add(" ");
        list.add("W");
        list.add("o");
        list.add("r");
        list.add("l");
        list.add("d");

        list.stream()
                .filter(s -> !s.equals("l"))
                .forEach(s -> System.out.print(s)); // Java 8

//        list.stream().forEach(new Consumer<String>() {  // Not Lambda
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
    }
}
