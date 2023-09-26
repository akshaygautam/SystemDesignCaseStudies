package designPatterns.structuralPatterns.bridge;

public interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int volume);

    int getVolume();
}
