package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.enums.VehicleType;

import java.util.*;

public class Van extends Vehicle{
    public Van(String licenseNumber) {
        super(licenseNumber, VehicleType.VAN);
    }
}
