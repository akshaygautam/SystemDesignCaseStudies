package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.enums.VehicleType;

import java.util.*;

public class Car extends Vehicle{
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }
}
