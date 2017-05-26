package io.javabrains4;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/** * Created by Paulo Vila Nova on 2017-05-26.
 */
public class WaterStream {

    public static void main(String[] args) {

        Water water = new Water("water", 10, "big stone", 1, "small stone", 3);
        water.stream()
                .filter(BigStoneFilter)
                .filter(SmallStoneFilter)
                .map(convertWaterColour)
                .forEach(s -> System.out.println(s));
    }

    private static Predicate<String> BigStoneFilter = s -> !s.equals("big stone");
    private static Predicate<String> SmallStoneFilter = s -> !s.equals("small stone");
    private static Function<String, String> convertWaterColour = s -> s + " black";


    public static class Water extends ArrayList<String> {

        public Water(String water, int litre, String s1, int bigStone, String s, int smallStone) {

            super(litre + bigStone + smallStone);
            for (int i = 0; i < litre; i++) {
                add("water");
            }
            add(2, "big stone");
            add(5, "small stone");
            add(7, "small stone");
            add(8, "small stone");

        }
    }

}
