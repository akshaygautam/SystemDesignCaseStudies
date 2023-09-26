package designPatterns.behavioralPatterns.state.states;

import designPatterns.behavioralPatterns.state.BobState;

public class SadBobState implements BobState {
    @Override
    public void sayHello() {
        System.out.println("Sad Bob says: Hello...");
    }

    @Override
    public void doWork() {
        System.out.println("Sad Bob is moping while working.");
    }
}