package org.designPatterns.strategyDP.vehicleTypes;

import lombok.Getter;
import org.designPatterns.strategyDP.Vehicle;
import org.designPatterns.strategyDP.strategy.FastDrive;

@Getter
public class VIPCar extends Vehicle {

    public VIPCar() {
        super(new FastDrive());
    }
}
