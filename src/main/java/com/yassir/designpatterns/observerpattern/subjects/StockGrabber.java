package com.yassir.designpatterns.observerpattern.subjects;

import com.yassir.designpatterns.observerpattern.interfaces.Observer;
import com.yassir.designpatterns.observerpattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Observer " + observer.name + " subscribed.");
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer " + observer.name + " un-subscribed.");
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice, aaplPrice, googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
