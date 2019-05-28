package com.yassir.designpatterns.strategypattern.models;

import com.yassir.designpatterns.strategypattern.strategies.MovingStrategy;
import com.yassir.designpatterns.strategypattern.strategies.WalkStrategy;

public class Person {

    private MovingStrategy movingStrategy = new WalkStrategy();

    public void move() {
        movingStrategy.move();
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}
