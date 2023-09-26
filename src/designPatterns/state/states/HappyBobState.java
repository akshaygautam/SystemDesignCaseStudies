package designPatterns.state.states;

import designPatterns.state.BobState;

import java.util.*;

public class HappyBobState implements BobState {

    @Override
    public void sayHello() {
        System.out.println("Happy Bob says: Hello, friend!");
    }

    @Override
    public void doWork() {
        System.out.println("Happy Bob is dancing while working!");
    }
}
