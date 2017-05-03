package io.reactiveJava;

import java.util.*;

/** * Created by Paulo Vila Nova on 2017-04-18.
 */
public class PullApproach {

    private static ArrayList<String > data = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        //currentDateTime();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

//        Iterator<String > iterator = data.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Timer timer = new Timer();
        timer.schedule(dataTimerTask, 0, 1000);

        Thread.sleep(4000);
        currentDateTime();
        data.add("E");
        data.add("F");

    }

    //Get the current time and date
    private static void currentDateTime() {
        System.out.println(new Date(System.currentTimeMillis()).toString());
    }

    private static void iterateOnData(List data) {
        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static final TimerTask dataTimerTask = new TimerTask() {
        private int lastCount = 0;

        @Override
        public void run() {
            currentDateTime();
            if(lastCount != data.size()){
                iterateOnData(data);
                lastCount = data.size();
            }else{
                System.out.println("No change in data");
            }

        }
    };
}

