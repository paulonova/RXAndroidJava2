package io.javabrains2;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-02.
 */
public class StandardFunctionalInterfacesEx {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Paulo", "Nova", 47),
                new Person("David", "Mozer", 13),
                new Person("Kelli", "Mozer", 31),
                new Person("Pedro", "Osório", 38),
                new Person("Francisco", "Lejon", 50)
        );

        // Step 1: Sort list by last name:
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        performConditionally(people, p -> true, p -> System.out.println(p));


        //Step 3: Create a method that prints all people that have last name beginning with M
        System.out.println("");
        System.out.println("Printing all people with last starts with M");
        performConditionally(people, p -> p.getLastName().startsWith("M"), p -> System.out.println(p));

        System.out.println("");
        System.out.println("Printing all people with first starts with P");
        performConditionally(people, p -> p.getFirstName().startsWith("P"), p -> System.out.println(p.getFirstName()));


    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){   //java.util.function.Predicate
        for (Person p : people){
            if(predicate.test(p)){
                //System.out.println(p);
                consumer.accept(p);
            }
        }
    }


//    private static void printAll(List<Person> people){
//        for (Person p : people){
//            System.out.println(p);
//        }
//    }


}
