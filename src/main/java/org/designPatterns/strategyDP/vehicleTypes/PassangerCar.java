package org.designPatterns.strategyDP.vehicleTypes;

import org.designPatterns.strategyDP.Vehicle;
import org.designPatterns.strategyDP.strategy.NormalDrive;

public class PassangerCar extends Vehicle {

    public PassangerCar() {
        super(new NormalDrive());
    }
}
