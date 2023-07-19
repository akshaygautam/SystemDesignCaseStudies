package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.enums.VehicleType;

import java.util.*;

public class Motorbike extends Vehicle{
    public Motorbike(String licenseNumber) {
        super(licenseNumber, VehicleType.TWO_WHEELER);
    }
}
