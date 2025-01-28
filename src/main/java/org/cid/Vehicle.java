package org.cid;

import org.cid.strategy.DriveStrategy;

public abstract class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
