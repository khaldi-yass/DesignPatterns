package com.yassir.designpatterns.observerpattern.observers;

import com.yassir.designpatterns.observerpattern.interfaces.Observer;
import com.yassir.designpatterns.observerpattern.interfaces.Subject;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        StringBuilder builder = new StringBuilder();
        builder.append("=================== New Update [" + name + "] ===================" + "\n");
        builder.append("-> IBM : " + ibmPrice + "\n");
        builder.append("-> GOOG: " + googPrice + "\n");
        builder.append("-> AAPL: " + aaplPrice + "\n");
        builder.append("==================================================" + "\n");
        System.out.println(builder.toString());
    }

}
