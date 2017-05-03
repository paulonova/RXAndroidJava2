package io.reactiveJava;

import java.util.*;

/** * Created by Paulo Vila Nova on 2017-04-18.
 */
public class PushWithoutRX  {



    public static void main(String[] args) throws InterruptedException {

        currentDateTime();
        Data data = new Data(callback);
        data.subscribe(observer);

        Thread.sleep(4000);
        currentDateTime();
        data.add("E");
        currentDateTime();
        data.add("F");

        //data.unSubscribe(observer);
    }

    private static Data.Callback callback = new Data.Callback() {
        @Override
        public void dataChanged(List data) {
            iterateOnData(data);
        }
    };


    private interface Observable {
        void subscribe(Observer observer);
        void unSubscribe(Observer observer);
        void notifyToEveryOne();
    }

    private interface Observer {
        void heyDataIsChanged(List data);
    }

    private static class Data implements Observable {

        private ArrayList<String> data = new ArrayList<>();
        private Callback callback;


        private interface Callback{
            void dataChanged(List data);
        }

        private List<Observer> observers = new ArrayList<>();

        @Override
        public void subscribe(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void unSubscribe(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyToEveryOne() {
            for (Observer observer : observers) {
                observer.heyDataIsChanged(data);
            }
        }



        public Data(Callback callback) {
            this.callback = callback;
            data.add("A");
            data.add("B");
            data.add("C");
            data.add("D");
            iterateOnData(data);
        }

        void add(String object) {
            data.add(object);
//            notifyToEveryOne();
            callback.dataChanged(data);
        }

    }

    

    private static Observer observer = new Observer() {
        @Override
        public void heyDataIsChanged(List data) {
            iterateOnData(data);
        }
    };


    private static void iterateOnData(List data) {
        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void currentDateTime() {
        System.out.println(new Date(System.currentTimeMillis()).toString());
    }

}
