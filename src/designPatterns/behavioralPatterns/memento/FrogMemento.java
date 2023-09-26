package designPatterns.behavioralPatterns.memento;

public class FrogMemento {
    private boolean isFrog;

    public FrogMemento(boolean isFrog) {
        this.isFrog = isFrog;
    }

    public boolean isFrog() {
        return isFrog;
    }
}
