package com.yassir.designpatterns.abstractfactorypattern;

import com.yassir.designpatterns.abstractfactorypattern.factories.AbstractArtFactory;
import com.yassir.designpatterns.abstractfactorypattern.factories.FactoryProducer;
import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;

/**
 * Type:
 *      Creational pattern.
 *
 * What it does:
 *      Provides an interface for creating families of related
 *      or dependent objects without specifying their concrete class.
 *
 * What it really does (no bullshit explanation):
 *      Let the factory call a bunch of other factories in order to return the concrete object;
 *
 * Truth is I am still very suspicious about the utility of this design pattern
 * as we could use the method factory at any time.
 */
public class Demo {

    public static void main(String[] args) {

        AbstractArtFactory artFactory = FactoryProducer.getArtFactory(true);
        AsciiArt triangleArt = artFactory.getAsciiArt("triangle");
        AsciiArt cubeArt = artFactory.getAsciiArt("cube");
        triangleArt.draw();
        cubeArt.draw();

        artFactory = FactoryProducer.getArtFactory(false);
        triangleArt = artFactory.getAsciiArt("triangle");
        cubeArt = artFactory.getAsciiArt("cube");
        triangleArt.draw();
        cubeArt.draw();

    }
}
