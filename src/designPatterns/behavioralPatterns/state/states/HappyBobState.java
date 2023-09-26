package designPatterns.behavioralPatterns.state.states;

import designPatterns.behavioralPatterns.state.BobState;

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
