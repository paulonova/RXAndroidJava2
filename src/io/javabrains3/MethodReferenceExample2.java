package io.javabrains3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-03.
 */
public class MethodReferenceExample2 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Paulo", "Nova", 47),
                new Person("David", "Mozer", 13),
                new Person("Kelli", "Mozer", 31),
                new Person("Pedro", "Osório", 38),
                new Person("Francisco", "Lejon", 50)
        );


        System.out.println("Printing all people");
//        performConditionally(people, p -> true, p -> System.out.println(p));
        performConditionally(people, p -> true, System.out :: println); // Method reference


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