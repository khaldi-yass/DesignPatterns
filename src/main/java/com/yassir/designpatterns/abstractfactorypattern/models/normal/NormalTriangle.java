package com.yassir.designpatterns.abstractfactorypattern.models.normal;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;

public class NormalTriangle implements AsciiArt {

    @Override
    public void draw() {
        System.out.println("======================Normal triangle ==================================");
        System.out.println("        /\\\n"
                           + "       /  \\\n"
                           + "      /    \\\n"
                           + "     /______\\\n"
                           + "    / _____ \\\\\n"
                           + "   / / ---,\\| \\\n"
                           + "  /  ||____/|  \\\n"
                           + " /   \\______/   \\\n"
                           + "/________________\\\n");
        System.out.println("========================================================================");
    }
}
