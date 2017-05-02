package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-02.
 */
public class Unit1ExerciseJava8 {

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
        printConditionally(people, p -> true);


        //Step 3: Create a method that prints all people that have last name beginning with M
        System.out.println("");
        System.out.println("Printing all people with last starts with M");
        printConditionally(people, p -> p.getLastName().startsWith("M"));

        System.out.println("");
        System.out.println("Printing all people with first starts with P");
        printConditionally(people, p -> p.getFirstName().startsWith("P"));


    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate){   //java.util.function.Predicate
        for (Person p : people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }


//    private static void printAll(List<Person> people){
//        for (Person p : people){
//            System.out.println(p);
//        }
//    }


}
