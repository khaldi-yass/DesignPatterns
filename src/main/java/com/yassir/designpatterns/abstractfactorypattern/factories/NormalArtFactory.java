package com.yassir.designpatterns.abstractfactorypattern.factories;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;
import com.yassir.designpatterns.abstractfactorypattern.models.normal.NormalCube;
import com.yassir.designpatterns.abstractfactorypattern.models.normal.NormalTriangle;

public class NormalArtFactory extends AbstractArtFactory {

    @Override
    public AsciiArt getAsciiArt(String shapeType) {
        if ("CUBE".equalsIgnoreCase(shapeType)) {
            return new NormalCube();
        }
        if ("TRIANGLE".equalsIgnoreCase(shapeType)) {
            return new NormalTriangle();
        }
        return null;
    }
}
