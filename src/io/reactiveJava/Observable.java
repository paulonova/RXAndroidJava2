package io.reactiveJava;

/** * Created by Paulo Vila Nova on 2017-04-18.
 */
public interface Observable {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifyToEveryOne();
}
