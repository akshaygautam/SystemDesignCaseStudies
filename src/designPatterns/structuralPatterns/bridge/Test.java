package designPatterns.structuralPatterns.bridge;

import designPatterns.structuralPatterns.bridge.devices.DVDPlayer;
import designPatterns.structuralPatterns.bridge.devices.TV;
import designPatterns.structuralPatterns.bridge.remotes.DVDRemote;
import designPatterns.structuralPatterns.bridge.remotes.TVRemote;

public class Test {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new TVRemote(tv);

        Device dvdPlayer = new DVDPlayer();
        RemoteControl dvdRemote = new DVDRemote(dvdPlayer);

        tvRemote.turnOn();
        tvRemote.increaseVolume();
        tvRemote.decreaseVolume();
        tvRemote.turnOff();

        dvdRemote.turnOn();
        dvdRemote.increaseVolume();
        dvdRemote.turnOff();
    }
}
