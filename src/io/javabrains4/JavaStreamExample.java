package io.javabrains4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-26.
 *
 * http://www.uwanttolearn.com/android/war-learning-curve-rx-java-2-java-8-stream-android-rxjava2-hell-part4/
 */
public class JavaStreamExample {

    public static void main(String[] args) {

        Water water = new Water("water",10, "big stone", 1 , "small stone", 3);



        // 10 litre water with 1 big and 3 small stones.
//        water.stream()
//                .filter(bigStoneFilter)
//                .filter(smallStoneFilter)
//                .map(convertWaterColour)
//                .forEach(s-> System.out.println(s));

    }


//    private static Predicate<String> bigStoneFilter = new Predicate<String>() {
//        @Override
//        public boolean test(String s) {
//            return !s.equals("big stone");
//        }
//    };

    /**Method above converted in Lambda*/
    private static Predicate<String> bigStoneFilter = s -> !s.equals("big stone");
    private static Predicate<String> smallStoneFilter = s -> !s.equals("small stone");


//    private static Function<String, String> convertWaterColour = new Function<String, String>() {
//        @Override
//        public String apply(String s) {
//            return s + " black";
//        }
//    };

    /**Method above converted in Lambda*/
    private static Function<String, String> convertWaterColour = s -> s + " black";

}
