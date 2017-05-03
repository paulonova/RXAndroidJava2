package io.javabrains3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;

/** * Created by Paulo Vila Nova on 2017-05-03.
 */
public class CollectionIterationExample {


    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Paulo", "Nova", 47),
                new Person("David", "Mozer", 13),
                new Person("Kelli", "Mozer", 31),
                new Person("Pedro", "Osório", 38),
                new Person("Francisco", "Lejon", 50)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size() ; i++) {
            System.out.println(people.get(i));
        }

        System.out.println("");
        System.out.println("Using for each");
        for (Person p : people){
            System.out.println(p);
        }

        System.out.println("Using lambda for each");
//        people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);

    }
}
