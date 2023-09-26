package designPatterns.behavioralPatterns.state;

import designPatterns.behavioralPatterns.state.states.SadBobState;

public class Bob {
    private BobState state;

    public Bob() {
        this.state = new SadBobState();
    }

    public void setState(BobState state) {
        this.state = state;
    }

    public void sayHello() {
        state.sayHello();
    }

    public void doWork() {
        state.doWork();
    }
}
