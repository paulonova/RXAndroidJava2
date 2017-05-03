package io.javabrains3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;

/** * Created by Paulo Vila Nova on 2017-05-03.
 */
public class StreamsExample1 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Paulo", "Nova", 47),
                new Person("David", "Mozer", 13),
                new Person("Kelli", "Mozer", 31),
                new Person("Pedro", "Osório", 38),
                new Person("Francisco", "Lejon", 50)
        );

    }
}
