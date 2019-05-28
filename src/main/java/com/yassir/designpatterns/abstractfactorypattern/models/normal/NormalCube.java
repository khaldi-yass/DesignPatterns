package com.yassir.designpatterns.abstractfactorypattern.models.normal;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;

public class NormalCube implements AsciiArt {

    @Override
    public void draw() {
        System.out.println("======================Normal cube ==================================");
        System.out.println("+------+.    \n"
                           + "|`.    | `.  \n"
                           + "|  `+--+---+ \n"
                           + "|   |  |   | \n"
                           + "+---+--+.  | \n"
                           + " `. |    `.| \n"
                           + "   `+------+ ");
        System.out.println("========================================================================");
    }
}
