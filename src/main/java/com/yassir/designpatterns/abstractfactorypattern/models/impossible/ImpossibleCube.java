package com.yassir.designpatterns.abstractfactorypattern.models.impossible;

import com.yassir.designpatterns.abstractfactorypattern.models.AsciiArt;

public class ImpossibleCube implements AsciiArt {

    @Override
    public void draw() {
        System.out.println("======================Impossible cube ==================================");
        System.out.println("         _________________________.\n"
                           + "        / _____________________  /|\n"
                           + "       / / ___________________/ / |\n"
                           + "      / / /| |               / /  |\n"
                           + "     / / / | |              / / . |\n"
                           + "    / / /| | |             / / /| |\n"
                           + "   / / / | | |            / / / | |\n"
                           + "  / / /  | | |           / / /| | |\n"
                           + " / /_/___| | |__________/ / / | | |\n"
                           + "/________| | |___________/ /  | | |\n"
                           + "| _______| | |__________ | |  | | |\n"
                           + "| | |    | | |_________| | |__| | |\n"
                           + "| | |    | |___________| | |____| |\n"
                           + "| | |   / / ___________| | |_  / /\n"
                           + "| | |  / / /           | | |/ / /\n"
                           + "| | | / / /            | | | / /\n"
                           + "| | |/ / /             | | |/ /\n"
                           + "| | | / /              | | ' /\n"
                           + "| | |/_/_______________| |  /\n"
                           + "| |____________________| | /\n"
                           + "|________________________|/\n");
        System.out.println("========================================================================");
    }
}
