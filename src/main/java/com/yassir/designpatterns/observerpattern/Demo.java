package com.yassir.designpatterns.observerpattern;

import com.yassir.designpatterns.observerpattern.interfaces.Observer;
import com.yassir.designpatterns.observerpattern.observers.StockObserver;
import com.yassir.designpatterns.observerpattern.subjects.StockGrabber;

/**
 * Type:
 *      Behavioral pattern.
 * What it does:
 *      Define a one-to-many dependency between objects so that when one object changes state,
 *      all its dependents are notified and updated automatically.
 */
public class Demo {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        Observer stockObserver = new StockObserver("Client1", stockGrabber);
        Observer stockObserver2 = new StockObserver("Client2", stockGrabber);
        Observer stockObserver3 = new StockObserver("Client3", stockGrabber);

        stockGrabber.setAaplPrice(123);
        stockGrabber.setIbmPrice(123);
        stockGrabber.setGoogPrice(123);

        stockGrabber.unSubscribe(stockObserver);
        stockGrabber.unSubscribe(stockObserver2);
        stockGrabber.unSubscribe(stockObserver3);
    }
}
