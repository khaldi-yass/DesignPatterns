package com.yassir.designpatterns.decoratorpattern.decorators;

import com.yassir.designpatterns.decoratorpattern.models.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.print("Decorator: Red ");
        decoratedShape.draw();
    }

    //Other methods that can alternate our shape
}
