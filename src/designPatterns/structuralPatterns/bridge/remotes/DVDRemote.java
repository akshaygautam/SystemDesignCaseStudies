package designPatterns.structuralPatterns.bridge.remotes;

import designPatterns.structuralPatterns.bridge.Device;
import designPatterns.structuralPatterns.bridge.RemoteControl;

public class DVDRemote extends RemoteControl {
    public DVDRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    @Override
    public void increaseVolume() {
        System.out.println("DVD Player does not support volume control");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("DVD Player does not support volume control");
    }
}
