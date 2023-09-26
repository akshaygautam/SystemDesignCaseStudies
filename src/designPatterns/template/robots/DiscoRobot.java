package designPatterns.template.robots;

public class DiscoRobot extends DancingRobot {

    // Implementation of abstract methods
    @Override
    protected void startDance() {
        System.out.println("Disco Robot starts dancing!");
    }

    @Override
    protected void performDanceMoves() {
        System.out.println("Disco Robot grooves to the disco beat.");
    }

    @Override
    protected void finishDance() {
        System.out.println("Disco Robot finishes the dance with a flourish!");
    }
}

