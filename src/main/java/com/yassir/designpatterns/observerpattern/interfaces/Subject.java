package com.yassir.designpatterns.observerpattern.interfaces;

public interface Subject {

    public void subscribe(Observer observer);

    public void unSubscribe(Observer observer);

    public void notifyObserver();
}
