package io.higherOrderFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-26.
 *
 * Example of Higher Order Function ==> A function with at least one parameter of type function or a function that returns function
 */
public class HigherOrderFunction{

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /**
         * BiFunction ==> Interface who has two parameter and return the third */
        BiFunction<List<Integer>,
                        Predicate<Integer>,
                        List<Integer>> filter;  //return

        /**Predicate ==> Interface who accepts one parameter and return TRUE or FALSE*/
        filter = (l, predicate) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer element : l){
                if(predicate.test(element))
                    result.add(element);
            }
            return result;
        };

        System.out.println(filter.apply(list, x -> x % 2 != 0));

    }


}
