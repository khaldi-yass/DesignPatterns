package com.yassir.designpatterns.abstractfactorypattern.factories;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;
import com.yassir.designpatterns.abstractfactorypattern.models.impossible.ImpossibleCube;
import com.yassir.designpatterns.abstractfactorypattern.models.impossible.ImpossibleTriangle;

public class ImpossibleArtFactory extends AbstractArtFactory {

    @Override
    public AsciiArt getAsciiArt(String shapeType) {
        if ("CUBE".equalsIgnoreCase(shapeType)) {
            return new ImpossibleCube();
        }
        if ("TRIANGLE".equalsIgnoreCase(shapeType)) {
            return new ImpossibleTriangle();
        }
        return null;
    }
}
