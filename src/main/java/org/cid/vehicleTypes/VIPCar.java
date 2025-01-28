package org.cid.vehicleTypes;

import lombok.Getter;
import org.cid.Vehicle;
import org.cid.strategy.DriveStrategy;
import org.cid.strategy.FastDrive;

@Getter
public class VIPCar extends Vehicle {

    public VIPCar() {
        super(new FastDrive());
    }
}
