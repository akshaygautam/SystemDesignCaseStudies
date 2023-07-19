package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.enums.VehicleType;

import java.util.*;

public class Truck extends Vehicle{
    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleType.TRUCK);
    }
}
