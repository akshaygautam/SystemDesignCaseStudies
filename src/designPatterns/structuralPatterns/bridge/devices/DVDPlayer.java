package designPatterns.structuralPatterns.bridge.devices;

import designPatterns.structuralPatterns.bridge.Device;

public class DVDPlayer implements Device {
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("DVD Player is ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("DVD Player is OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD Player does not support volume control");
    }

    @Override
    public int getVolume() {
        System.out.println("DVD Player does not support volume control");
        return 0;
    }
}
