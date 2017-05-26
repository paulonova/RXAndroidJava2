package io.reactiveJava;

import rx.*;
import rx.Observable;

/** * Created by Paulo Vila Nova on 2017-05-01.
 */
public class FunctionalLambda {


    public static void main(String[] args) {

        Integer array []= {1,2,3,4,5};

        new Thread(new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < array.length; i++) {
//                    array[i] = array[i]+1;
//                }

                Observable.from(array)
                        .map(integer -> integer + 1)
                        .subscribe(integer -> {});
            }
        }).start();

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(square(array[i]));
//        }

        Observable.from(array)
                .map(integer -> square(integer))
                .subscribe(integer -> System.out.println(integer));

    }


    private static int square(int a){
        return a*a;
    }

}
