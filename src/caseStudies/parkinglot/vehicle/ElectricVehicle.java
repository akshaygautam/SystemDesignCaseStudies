package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.enums.VehicleType;

public class ElectricVehicle extends Vehicle{
    public ElectricVehicle(String licenseNumber) {
        super(licenseNumber, VehicleType.ELECTRIC);
    }
}
