package org.designPatterns.strategyDP.strategy;

public class FastDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving fast");
    }
}
