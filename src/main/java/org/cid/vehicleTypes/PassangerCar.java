package org.cid.vehicleTypes;

import org.cid.Vehicle;
import org.cid.strategy.NormalDrive;

public class PassangerCar extends Vehicle {

    public PassangerCar() {
        super(new NormalDrive());
    }
}
