package designPatterns.state;

import designPatterns.state.states.SadBobState;

import java.util.*;

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
