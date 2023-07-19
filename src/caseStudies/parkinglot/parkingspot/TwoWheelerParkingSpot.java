package caseStudies.parkinglot.parkingspot;

import caseStudies.parkinglot.enums.ParkingSpotType;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(String number) {
        super(number, ParkingSpotType.TWO_WHEELER);
    }
}
