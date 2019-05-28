package com.yassir.designpatterns.abstractfactorypattern.factories;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;

public abstract class AbstractArtFactory {

    public abstract AsciiArt getAsciiArt(String shapeType);
}
