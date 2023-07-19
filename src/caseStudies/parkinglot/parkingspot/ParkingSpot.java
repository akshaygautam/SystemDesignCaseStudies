package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.ParkingFloor;
import caseStudies.parkinglot.enums.ParkingSpotType;
import caseStudies.parkinglot.vehicle.Vehicle;

import java.util.Objects;

public abstract class ParkingSpot {
    private final String number;
    private boolean isEmpty;
    private Vehicle vehicle;
    private final ParkingSpotType type;


    public ParkingSpot(String number, ParkingSpotType type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return Objects.equals(number, that.number) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type);
    }

    public String getNumber() {
        return number;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    private void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void removeVehicle() {
        this.vehicle = null;
        setEmpty(true);
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        setEmpty(false);
    }

    public ParkingSpotType getType() {
        return type;
    }
}
