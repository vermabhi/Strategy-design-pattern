package org.cid;

import org.cid.vehicleTypes.PassangerCar;
import org.cid.vehicleTypes.SportsCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new PassangerCar();
        vehicle.drive();
    }
}