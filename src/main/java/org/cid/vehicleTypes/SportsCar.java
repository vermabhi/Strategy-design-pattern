package org.cid.vehicleTypes;

import org.cid.Vehicle;
import org.cid.strategy.FastDrive;

public class SportsCar extends Vehicle {

    public SportsCar() {
        super(new FastDrive());
    }
}
