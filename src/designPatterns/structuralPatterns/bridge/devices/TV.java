package designPatterns.structuralPatterns.bridge.devices;

import designPatterns.structuralPatterns.bridge.Device;

public class TV implements Device {
    private boolean isOn = false;
    private int volume = 50;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV is ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume set to " + volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
