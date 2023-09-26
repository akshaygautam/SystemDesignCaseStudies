package designPatterns.state;

import designPatterns.state.states.HappyBobState;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Bob bob = new Bob();

        bob.sayHello();
        bob.doWork();

        bob.setState(new HappyBobState());

        bob.sayHello();
        bob.doWork();
    }
}
