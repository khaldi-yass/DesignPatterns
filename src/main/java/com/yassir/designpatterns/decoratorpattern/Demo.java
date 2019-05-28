package com.yassir.designpatterns.decoratorpattern;

import com.yassir.designpatterns.decoratorpattern.decorators.RedShapeDecorator;
import com.yassir.designpatterns.decoratorpattern.models.Circle;
import com.yassir.designpatterns.decoratorpattern.models.Rectangle;
import com.yassir.designpatterns.decoratorpattern.models.Shape;

/**
 * Type:
 *      Structural pattern.
 * What it does:
 *      Attach additional responsibilities to an object dynamically.
 *      Provide a flexible alternative to sub-classing for extending functionality.
 */
public class Demo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);
        redCircle.draw();
        redRectangle.draw();
    }
}
