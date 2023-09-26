package designPatterns.template.robots;

public class BreakDanceRobot extends DancingRobot {

    // Implementation of abstract methods
    @Override
    protected void startDance() {
        System.out.println("Breakdance Robot starts breaking it down!");
    }

    @Override
    protected void performDanceMoves() {
        System.out.println("Breakdance Robot does some impressive breakdance moves.");
    }

    @Override
    protected void finishDance() {
        System.out.println("Breakdance Robot finishes with a cool freeze!");
    }
}
