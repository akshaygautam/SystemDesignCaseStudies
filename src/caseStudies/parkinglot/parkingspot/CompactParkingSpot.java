package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.ParkingFloor;
import caseStudies.parkinglot.enums.ParkingSpotType;

public class CompactParkingSpot extends ParkingSpot{
    public CompactParkingSpot(String number) {
        super(number, ParkingSpotType.COMPACT);
    }

}
