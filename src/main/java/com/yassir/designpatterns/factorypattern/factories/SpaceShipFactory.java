package com.yassir.designpatterns.factorypattern.factories;

import com.yassir.designpatterns.factorypattern.models.BigUfoShip;
import com.yassir.designpatterns.factorypattern.models.RocketShip;
import com.yassir.designpatterns.factorypattern.models.SpaceShip;
import com.yassir.designpatterns.factorypattern.models.UfoShip;

public class SpaceShipFactory {

    public SpaceShip makeSpaceShip(char type) {
        switch (type) {
        case 'U':
            return new UfoShip();
        case 'R':
            return new RocketShip();
        case 'B':
            return new BigUfoShip();
        default:
            return null;
        }
    }
}
