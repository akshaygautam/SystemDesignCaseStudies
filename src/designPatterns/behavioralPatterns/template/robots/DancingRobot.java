package designPatterns.behavioralPatterns.template.robots;

public abstract class DancingRobot {
    public final void dance() {
        startDance();
        performDanceMoves();
        finishDance();
    }

    protected abstract void startDance() ;
    protected abstract void performDanceMoves();
    protected abstract void finishDance();

}
