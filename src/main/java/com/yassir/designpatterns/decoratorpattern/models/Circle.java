package com.yassir.designpatterns.decoratorpattern.models;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle drawing");
    }
}
