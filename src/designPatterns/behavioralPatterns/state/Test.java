package designPatterns.behavioralPatterns.state;

import designPatterns.behavioralPatterns.state.states.HappyBobState;

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
