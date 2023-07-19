package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.enums.ParkingSpotType;

import java.util.*;

public class LargeParkingSpot extends ParkingSpot{
    public LargeParkingSpot(String number) {
        super(number, ParkingSpotType.LARGE);
    }
}
