package com.yassir.designpatterns.abstractfactorypattern.factories;

public class FactoryProducer {

    public static AbstractArtFactory getArtFactory(boolean impossible) {
        return impossible ? new ImpossibleArtFactory() : new NormalArtFactory();
    }
}
