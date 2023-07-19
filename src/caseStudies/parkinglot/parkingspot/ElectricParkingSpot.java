package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.enums.ParkingSpotType;

import java.util.*;

public class ElectricParkingSpot extends ParkingSpot{
    public ElectricParkingSpot(String number) {
        super(number, ParkingSpotType.ELECTRIC);
    }
}
