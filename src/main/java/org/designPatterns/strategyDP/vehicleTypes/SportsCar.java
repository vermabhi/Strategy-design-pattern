package org.designPatterns.strategyDP.vehicleTypes;

import org.designPatterns.strategyDP.Vehicle;
import org.designPatterns.strategyDP.strategy.FastDrive;

public class SportsCar extends Vehicle {

    public SportsCar() {
        super(new FastDrive());
    }
}
