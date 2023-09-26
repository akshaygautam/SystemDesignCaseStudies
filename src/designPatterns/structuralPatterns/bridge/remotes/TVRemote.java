package designPatterns.structuralPatterns.bridge.remotes;

import designPatterns.structuralPatterns.bridge.Device;
import designPatterns.structuralPatterns.bridge.RemoteControl;

public class TVRemote extends RemoteControl {
    public TVRemote(Device device) {
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
        int newVolume = device.getVolume() + 10;
        device.setVolume(newVolume);
    }

    @Override
    public void decreaseVolume() {
        int newVolume = device.getVolume() - 10;
        device.setVolume(newVolume);
    }
}
