package designPatterns.state.states;

import designPatterns.state.BobState;

import java.util.*;

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