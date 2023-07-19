package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.enums.ParkingSpotType;

import java.util.*;

public class HandicappedParkingSpot extends ParkingSpot{
    public HandicappedParkingSpot(String number) {
        super(number, ParkingSpotType.HANDICAPPED);
    }
}
