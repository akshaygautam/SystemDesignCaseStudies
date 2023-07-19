package caseStudies.parkinglot;

import caseStudies.parkinglot.enums.ParkingSpotType;
import caseStudies.parkinglot.parkingspot.*;
import caseStudies.parkinglot.vehicle.Vehicle;

import java.util.*;

public class ParkingFloor {
    private String name;
    private HashSet<HandicappedParkingSpot> handicappedParkingSpots;
    private HashSet<CompactParkingSpot> compactParkingSpots;
    private HashSet<ElectricParkingSpot> electricParkingSpots;
    private HashSet<LargeParkingSpot> largeParkingSpots;
    private HashSet<TwoWheelerParkingSpot> twoWheelerParkingSpots;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void freeSpot(ParkingSpot spot){
        spot.removeVehicle();

    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        if (parkingSpot instanceof HandicappedParkingSpot) {
            handicappedParkingSpots.add((HandicappedParkingSpot) parkingSpot);
        } else if (parkingSpot instanceof CompactParkingSpot) {
            compactParkingSpots.add((CompactParkingSpot) parkingSpot);
        } else if (parkingSpot instanceof ElectricParkingSpot) {
            electricParkingSpots.add((ElectricParkingSpot) parkingSpot);
        } else if (parkingSpot instanceof TwoWheelerParkingSpot) {
            twoWheelerParkingSpots.add((TwoWheelerParkingSpot) parkingSpot);
        } else if (parkingSpot instanceof LargeParkingSpot) {
            largeParkingSpots.add((LargeParkingSpot) parkingSpot);
        } else {
            System.out.println("Invalid parking spot type: " + parkingSpot.getType());
        }
    }
    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
    }

}
