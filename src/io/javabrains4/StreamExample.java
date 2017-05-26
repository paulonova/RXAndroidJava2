package io.javabrains4;

import java.util.ArrayList;
import java.util.List;

/** * Created by Paulo Vila Nova on 2017-05-04.
 */
public class StreamExample {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        //Using Stream and Lambda..  Do the same thing...
        list.stream().forEach(integer -> System.out.println(integer));


    }
}
