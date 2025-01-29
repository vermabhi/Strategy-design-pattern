package org.designPatterns.strategyDP.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Normal");
    }
}
