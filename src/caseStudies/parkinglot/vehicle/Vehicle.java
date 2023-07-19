package caseStudies.parkinglot.vehicle;

import caseStudies.parkinglot.ParkingTicket;
import caseStudies.parkinglot.enums.VehicleType;

public abstract class Vehicle {
    private final String licenseNumber;
    private final VehicleType vehicleType;
    private ParkingTicket ticket;

    public Vehicle(String licenseNumber, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public void setTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }
}
