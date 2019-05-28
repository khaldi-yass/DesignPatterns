package com.yassir.designpatterns.decoratorpattern.decorators;

import com.yassir.designpatterns.decoratorpattern.models.Shape;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

}
