package com.yassir.designpatterns.observerpattern.interfaces;

public abstract class Observer {

    public String name;
    protected Subject subject;

    public abstract void update(double ibmPrice, double aaplPrice, double googPrice);

}
